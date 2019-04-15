package HuaWei;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class HuaWei01 {

    public static ArrayList<String> generateArray(){
        Scanner scanner = new Scanner(System.in);
        // 用于读取从控制台读取到的Array;
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<ArrayList<String>>();
        // 将取完后的array返回
        ArrayList<String> newArray = new ArrayList<String>();
        // 先读取第一行的n
        int n = Integer.valueOf(scanner.next());
        while(!scanner.hasNext("quit")){
            String inputString = scanner.next();
            String[] inputArray = inputString.split(",");
            // 将去转换为ArrayList，这里为了方便处理，也可以不转换
            arrayLists.add(new ArrayList<String>(Arrays.asList(inputArray)));
        }

        while (arrayLists.size() > 0){
            // 按照每次取n个元素，组成新的数组
            for (int i = 0; i < arrayLists.size(); i ++){
                ArrayList<String> tempArray = arrayLists.get(i);
                if (tempArray.size() == 0){ //应对整数倍
                    arrayLists.remove(i);
                    // 删除arrayLists之后，下表会调整
                    i --;
                    continue;
                }
                int tempN = n;
                if (tempArray.size() > tempN){
                    // 取出前n个放入newArray
                    while (tempN > 0){
                        newArray.add(tempArray.get(0));
                        tempArray.remove(0);
                        tempN --;
                    }
                }else {
                    // 取出所有元素
                    for (int k = 0; k < tempArray.size(); k ++){
                        newArray.add(tempArray.get(k));
                    }
                    // 删除该数组
                    arrayLists.remove(i);
                    i --;
                }
            }
        }
        return newArray;
    }

    public static void main (String[] args){
        System.out.print(generateArray());

    }

}


