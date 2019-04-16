import java.util.HashMap;
import java.util.Scanner;

public class SubStringchongfu {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		char c[] = in.nextLine().toCharArray();
		int max = 0;
		char maxChar = 0;
		Integer tmp;
		for (int i = 0; i < c.length; i++) {
			tmp = map.put(c[i], 1);
			if (tmp != null) {
				map.put(c[i], ++tmp);
				if (max < tmp) {
					max = tmp;
					maxChar = c[i];
				}
			}
		}
		System.out.println("出现最多的是:" + maxChar);
		System.out.println("出现次数:" + max);
	}
}