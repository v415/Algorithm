import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//从键盘接收字符串
		//提示输入
		System.out.println("请输入字符串：");
		String input1=sc.nextLine();
	    String input2=sc.nextLine();
	    while(input1.length()>100||input2.length()>100) {
	    	System.out.println("您的输入有误，请重新输入字符串：");
	    	input1=sc.nextLine();
	    	input2=sc.nextLine();
	    }
	    char[] c1=input1.toCharArray();
	    char[] c2=input2.toCharArray();
	    output(c1);
	    output(c2);	
	}
	public static void output(char [] arr) {
		int count=arr.length/8+1;//判断字符串能分出多少个长度为8的数组
		char[][] ch=new char[count][8];//定义二维数组，用于存放
		for(int i=0;i<count;i++) {
			for(int j=0;j<8;j++) {
				ch[i][j]='0';
			}
		}
		for(int i=0;i<arr.length;i++) {
			ch[i/8][i%8]=arr[i];//把字符数组赋值到定义的二维数组
		}
		for(int i=0;i<count;i++) {//遍历输出结果
			for(int j=0;j<8;j++) {
				System.out.print(ch[i][j]+"");
			}
			System.out.println();
		}
		
	}
}
