import java.util.ArrayList;
import java.util.Scanner;

public class Tencent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}

		StringBuilder sb = new StringBuilder();
		int bt = 0;
		while (list.size() > 1) {
			bt = (bt + m - 1) % list.size();
			sb.append(list.remove(bt));
			if (list.size() != 1) {
				sb.append("");
			}
		}
		System.out.println(sb.toString());
		System.out.println(list.get(0));
	}

	/* ±º‰∏¥‘”∂»£∫
	 * int gcd(int m, int n) {
		while (n != 0)
			r = m % n;
		    m = n;
		    n = r;
		return m;
	}*/
}
