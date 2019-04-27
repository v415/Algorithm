package ch2;


public class Review11 {
	public int Fibonacci(int n) {
        if(n<=0)
            return 0;
        if(n==1)
            return 1;
        int  fibOne=0;
        int  fibTwo=1;
        int  fibN=0;
        int m=(int) Math.pow(2, n-1);
        for(int i=2;i<=n;i++){
           fibN=fibOne+fibTwo;
            fibOne=fibTwo;
            fibTwo=fibN;
        }
        return fibN;

    }
	public static void main(String[] args) {
		int flag=new Review11().Fibonacci(3);
		System.out.println(flag);
	}
}