import java.util.Scanner;

public class Erjinzhi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������һ����Ϊ�������");
		int n = s.nextInt();
		System.out.println(n + "�Ķ����Ʊ�ʾ��1�ĸ�����" + getNum(n));
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
