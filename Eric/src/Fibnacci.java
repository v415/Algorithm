
public class Fibnacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(6));

	}
	public static long fibonacci(int n) {
		long[] a= {0,1};//���е�ǰ����
		if(n<2) 
		return a[n];
		
		long fib1=0;
		long fib2=1;
		long fibN=0;
		for(int i=2;i<=n;i++) {
			fibN=fib1+fib2;
			fib1=fib2;
			fib2=fibN;			
		}
		return fibN;
	}

}
