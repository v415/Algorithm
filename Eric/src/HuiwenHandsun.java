import java.util.Scanner;

public class HuiwenHandsun {

	public static void main(String[] args) {
//		 System.out.println("������һ��N��M������");
//		 Scanner sc=new Scanner(System.in);
//		 int printnum=sc.nextInt();
/*	�磺12321    nv=0ʱ��temp%10=1��
				nv=1ʱ temp%10=2����ʱnv=nv*10+temp%10=1*10+2=12��
				nv=12ʱ��temp%10=3����ʱnv=nv*10+temp%10=12*10+3=123��
				nv=123ʱ��temp%10=2,��ʱnv=nv*10+temp%10=123*10+2=1232��
				nv=1232ʱ��temp%10=1,��ʱnv=nv*10+temp%10=1232*10+2=12321���ж���ϣ�12321�ǻ������� 
				temp��䣬temp/=10��ʵ�ִӸ�λ����λ����λ��ǧλ�ȣ��Դ����ơ�
*/
		 printValue(1,100000,233435);
	}
   public static void printValue(int N,int M,int k) {
	   int i;
	   for(i=N;i<=M;i++) {
		   int nv=0;
		   int temp=i;
		   int sum=0;
		   while(temp!=0) {
			   nv=nv*10+temp%10;//nv����i�ķ���ֵ
			   sum +=temp%10;//������λ֮��
			   temp/=10;
		   }
		   if(nv==i&&sum==k) {
			   System.out.println("�������У�"+nv);//��Ϊ����ͷ���ֵ��һ��������ֱ���������ֵ
		   }
	   }

   }
}
