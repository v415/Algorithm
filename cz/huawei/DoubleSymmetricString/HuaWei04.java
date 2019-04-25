package HuaWei;

import java.util.Scanner;

public class HuaWei04 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextLine()){
            String str=sc.nextLine();

            if (isSymmetry(str)){
                System.out.println(getSymmetry(str));
            }else {
                System.out.println(false);
            }
        }
    }
    private static String getSymmetry(String str){
        char[] arr=str.toCharArray();

        char[] arr1=new char[str.length()/2];
        int j=0;
        for (int i=0;i<arr.length;i+=2){
            arr1[j++]=arr[i];
        }
        return new String(arr1);
    }
    private static boolean isSymmetry(String str){
        char[] arr=str.toCharArray();
        int j=1;
        for (int i=0;i<str.length();i+=2){
                if (arr[i]!=arr[j]){
                    return false;
                }
            j+=2;

        }
       if (arr[0]!=arr[1]){
           return false;
       }
        int start=0;
        int end=arr.length-1;
        while (start<end&&arr[start]==arr[end]){
            if (start+1==end)
                return true;
            start++;
            end--;
        }
        return false;
    }
}
