import java.util.Scanner;

public class DaoXu {

	public static void main(String[] args) {
		System.out.println("请输入数字：");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		DaoXu dx = new DaoXu();
		int result = dx.Daoxu(input);
	}
	/**
	 * 倒序输出正整数的各位数 f(n)={ print(n%10), n< 10 
	 *                         print(n%10);f(n/10), n>=10
	 * @param n
	 */
	int Daoxu(int n) {
		System.out.print(n % 10);
		if (n >= 10) {
			Daoxu(n / 10);// 递归
			// System.out.print("倒序结果为："+result);
		}
		return n;
	}

}
