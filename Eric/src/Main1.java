import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//�Ӽ��̽����ַ���
		//��ʾ����
		System.out.println("�������ַ�����");
		String input1=sc.nextLine();
	    String input2=sc.nextLine();
	    while(input1.length()>100||input2.length()>100) {
	    	System.out.println("�����������������������ַ�����");
	    	input1=sc.nextLine();
	    	input2=sc.nextLine();
	    }
	    char[] c1=input1.toCharArray();
	    char[] c2=input2.toCharArray();
	    output(c1);
	    output(c2);	
	}
	public static void output(char [] arr) {
		int count=arr.length/8+1;//�ж��ַ����ֳܷ����ٸ�����Ϊ8������
		char[][] ch=new char[count][8];//�����ά���飬���ڴ��
		for(int i=0;i<count;i++) {
			for(int j=0;j<8;j++) {
				ch[i][j]='0';
			}
		}
		for(int i=0;i<arr.length;i++) {
			ch[i/8][i%8]=arr[i];//���ַ����鸳ֵ������Ķ�ά����
		}
		for(int i=0;i<count;i++) {//����������
			for(int j=0;j<8;j++) {
				System.out.print(ch[i][j]+"");
			}
			System.out.println();
		}
		
	}
}
