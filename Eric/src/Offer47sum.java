
public class Offer47sum {
/*
 * 求两个整数之和，不能使用+ - * /符号
利用位运算求知：如：5+17 
第一步：各数位相加，不进位，结果：12  第二步：做进位，进位值为10  第三步：把结果相加：10+22
*/
	public static void main(String[] args) {
		System.out.println("这两个整数之和为：");
		System.out.println(sum(23,25));		
	}
    private static int sum(int num1,int num2) {
    	while(num2!=0) {
    		//计算个位
    		int temp=num1^num2;
    		//计算进位
    		num2=(num1&num2)<<1;
    		num1=temp;
    	}
    	return num1;
    }
}
