
public class Offer52 {

	public static void main(String[] args) {
		 int a[]= {1,2,3};
		 System.out.println(multiply(a));

	}
	public static int[] multiply(int a[]) {
		int length=a.length;
		int b[]=new int[length];
		if(length !=0) {
			b[0]=1;
			//计算下三角矩阵
			for(int i=0;i<length;i++) {
				b[i]=b[i-1]*a[i-1];
			}
			int temp=1;
			//计算上三角矩阵
			for(int j=length-2;j>=0;j--) {
				temp *=a[j+1];
				b[j] *=temp;
			}
		}
		return b;
	}

}
