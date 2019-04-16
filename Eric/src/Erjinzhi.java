import java.util.Scanner;

public class Erjinzhi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个不为零的数：");
		int n = s.nextInt();
		System.out.println(n + "的二进制表示中1的个数是" + getNum(n));
	}

	public static int getNum(int n) {
		int num = 0;
		while (n != 0) {
			num++;
			n = (n - 1) & n;
		}
		return num;
	}
}
