import java.util.Scanner;

public class WeizhongBank2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] ss = sc.nextLine().split("");
			int n = Integer.valueOf(ss[0]);				
			int k = Integer.valueOf(ss[1]);
			/*Integer.valueOf(s)���ַ���s������Integer�������ͣ����ص�integer���Ե��ö����еķ�����
			 String s = "100";
		        Integer i1 = Integer.valueOf(s);
		        Integer i2 = Integer.valueOf(s);
		        if (i1 == i2) { //�����������
		            System.out.println("i1 == i2");
		        }
		        if (i1.equals(i2)) { //���������е�valueֵ���
		            System.out.println("i1.equals(i2)");
		        }*/	
			double m = Double.valueOf(ss[2]);
			if (m >= n) {
				System.out.println(k);

			} else {
				double a = Math.ceil((n * k) / m);//���ش��ڵ��ڲ���x����С����,���Ը���������ȡ��.
				System.out.println((int) a);
			}
		} catch (Exception e) {

		}
	}

}


