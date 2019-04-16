import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharMinpinduoduo {
/*
 * 小明给儿子小小明买了一套英文字母卡片（总共包含52张，区分大小写），小小明把卡片丢在地上玩耍，
 * 并从中取出若干张排成一排，形成了一个卡片序列。
此时，小明需要将卡片序列中的重复字母剔除（同一个字母的大小写只保留一个）。
请问，所有可能的结果中，字母序最小（不区分大小写）的序列的第一张卡片上是哪个字母？
输入描述:
一行输入，包含一个非空字符串，表示卡片序列，长度为N（1<=N<=52）。
输出描述:
一行输出，包含一个字母（如果结果是大写字母，则需要转成小写）。  如：输入xaDdl  输出为：a
*/
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("请输入一个字符串：");
	 String str=s.nextLine();
	 if(str==null||str.trim().length()==0) {//str.trim()删除首尾空格
		 System.out.println(" ");
		 return;
	 }
         str=str.toLowerCase();
         Map<Character,Integer> map=new HashMap<Character,Integer>();
         for(int i=0;i<str.length();i++) {
        	 char c=str.charAt(i);
        	 if(map.containsKey(c)) {
        		 map.put(c, (Integer)map.get(c)+1);//为什么加一
        	 }
        	 else {
        		 map.put(c, 1);
        	 }
         }
         char firstMin='z';
         for(int i=0;i<str.length();i++) {
        	 char c=str.charAt(i);
        	 if(firstMin>c) {
        		 firstMin=c;
        	 }
        	 int value=map.get(c);
        	 if(value==1) {
        		 break;
        	 }else {
        		 map.put(c, value--);
        	 }
         }
         System.out.println(firstMin);
	}

}
