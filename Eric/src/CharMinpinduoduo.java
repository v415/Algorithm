import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharMinpinduoduo {
/*
 * С��������СС������һ��Ӣ����ĸ��Ƭ���ܹ�����52�ţ����ִ�Сд����СС���ѿ�Ƭ���ڵ�����ˣ��
 * ������ȡ���������ų�һ�ţ��γ���һ����Ƭ���С�
��ʱ��С����Ҫ����Ƭ�����е��ظ���ĸ�޳���ͬһ����ĸ�Ĵ�Сдֻ����һ������
���ʣ����п��ܵĽ���У���ĸ����С�������ִ�Сд�������еĵ�һ�ſ�Ƭ�����ĸ���ĸ��
��������:
һ�����룬����һ���ǿ��ַ�������ʾ��Ƭ���У�����ΪN��1<=N<=52����
�������:
һ�����������һ����ĸ���������Ǵ�д��ĸ������Ҫת��Сд����  �磺����xaDdl  ���Ϊ��a
*/
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("������һ���ַ�����");
	 String str=s.nextLine();
	 if(str==null||str.trim().length()==0) {//str.trim()ɾ����β�ո�
		 System.out.println(" ");
		 return;
	 }
         str=str.toLowerCase();
         Map<Character,Integer> map=new HashMap<Character,Integer>();
         for(int i=0;i<str.length();i++) {
        	 char c=str.charAt(i);
        	 if(map.containsKey(c)) {
        		 map.put(c, (Integer)map.get(c)+1);//Ϊʲô��һ
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
