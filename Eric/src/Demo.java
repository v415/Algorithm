import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int test=sc.nextInt();
         for(int i=0;i<test;i++) {
        	 int t=hasTimes(sc.nextInt());
        	 System.out.println(t);
         }
	}

	private static int hasTimes(int n) {
		 if(n==1) {
			 return 0; 
		 }
		int time=0;
		while(n!=1) {
			if(n%2==0) {
				n=n/2;
			}else {
				n=n*3+1;
			}
			time++;
		}
		return time;
	}

}
