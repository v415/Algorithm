import java.util.Scanner;

public class WeizhongBank2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] ss = sc.nextLine().split("");
			int n = Integer.valueOf(ss[0]);				
			int k = Integer.valueOf(ss[1]);
			/*Integer.valueOf(s)把字符串s解析成Integer对象类型，返回的integer可以调用对象中的方法。
			 String s = "100";
		        Integer i1 = Integer.valueOf(s);
		        Integer i2 = Integer.valueOf(s);
		        if (i1 == i2) { //两个对象相等
		            System.out.println("i1 == i2");
		        }
		        if (i1.equals(i2)) { //两个对象中的value值相等
		            System.out.println("i1.equals(i2)");
		        }*/	
			double m = Double.valueOf(ss[2]);
			if (m >= n) {
				System.out.println(k);

			} else {
				double a = Math.ceil((n * k) / m);//返回大于等于参数x的最小整数,即对浮点数向上取整.
				System.out.println((int) a);
			}
		} catch (Exception e) {

		}
	}

}


