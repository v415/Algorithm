import java.util.Scanner;

public class DaoXu {

	public static void main(String[] args) {
		System.out.println("���������֣�");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		DaoXu dx = new DaoXu();
		int result = dx.Daoxu(input);
	}
	/**
	 * ��������������ĸ�λ�� f(n)={ print(n%10), n< 10 
	 *                         print(n%10);f(n/10), n>=10
	 * @param n
	 */
	int Daoxu(int n) {
		System.out.print(n % 10);
		if (n >= 10) {
			Daoxu(n / 10);// �ݹ�
			// System.out.print("������Ϊ��"+result);
		}
		return n;
	}

}
