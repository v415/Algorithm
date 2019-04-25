package javapractice;

import java.util.Scanner;

import static java.lang.Integer.*;

public class ShuZuMaxNum {
    public static String MaxNum(String[] input){

            for (int j=0;j<input.length;j++){
                for (int m=j+1;m<input.length;m++) {
                    if (isbijiao(input[j], input[m]) == true) {
                        String temp = input[j];
                        input[j] = input[m];
                        input[m] = temp;
                    }
                }
            }
            String he="";
            for (int k=0;k<input.length;k++){
                he=he+input[k];
            }
            String maxnum=he;
            System.out.println(maxnum);
            return maxnum;
        }

    private static boolean isbijiao(String str1,String str2){
        String n=str1+str2;
        String m=str2+str1;
        if (parseInt(n)< parseInt(m)){
           return true;
        }else return false;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

            int n = sc.nextInt();
            //StringBuffer jieshou = new StringBuffer(sc.nextLine());
            String[] input = new String[n];
            for (int i = 0; i < input.length; i++) {
                input[i] = sc.next();
            }
            System.out.println(MaxNum(input));
    }

}
