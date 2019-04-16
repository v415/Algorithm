
public class FrogJump {
/*offer 9-2
 * 一只青蛙一次可以跳上1级或2级台阶，
 * 求青蛙跳上一个n级台阶一共有多少种跳法？
 * */
	public static void main(String[] args) {
		System.out.println(getMethodNumber(10));//假设台阶为10
	}
   private static int getMethodNumber(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	if(n==2) {
		return 2;
	}
	return getMethodNumber(n-1)+getMethodNumber(n-2);//递归调用
	   
   }
}
