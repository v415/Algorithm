import java.util.Scanner;

public class HuiwenHandsun {

	public static void main(String[] args) {
//		 System.out.println("请输入一个N到M的数：");
//		 Scanner sc=new Scanner(System.in);
//		 int printnum=sc.nextInt();
/*	如：12321    nv=0时，temp%10=1；
				nv=1时 temp%10=2，此时nv=nv*10+temp%10=1*10+2=12；
				nv=12时，temp%10=3，此时nv=nv*10+temp%10=12*10+3=123；
				nv=123时，temp%10=2,此时nv=nv*10+temp%10=123*10+2=1232；
				nv=1232时，temp%10=1,此时nv=nv*10+temp%10=1232*10+2=12321；判断完毕，12321是回文数。 
				temp会变，temp/=10；实现从个位到百位，百位到千位等，以此类推。
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
			   nv=nv*10+temp%10;//nv保存i的反序值
			   sum +=temp%10;//保存数位之和
			   temp/=10;
		   }
		   if(nv==i&&sum==k) {
			   System.out.println("回文数有："+nv);//因为正序和反序值都一样，所以直接输出反序值
		   }
	   }

   }
}
