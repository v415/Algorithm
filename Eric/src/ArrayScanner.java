import java.util.Random;
import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("���������鳤�ȣ�");
		int length = s1.nextInt();
		/*
		 * Integer arr1[]=new Integer[length];//Ҳ���������������� Integer arr2[]=new
		 * Integer[length];
		 */
		int arr1[] = new int[length];
		int arr2[] = new int[length];
		System.out.println("�������һ������Ϊ" + length + "������");
		for (int i = 0; i < length; i++) {
			arr1[i] = s1.nextInt();		
		}
		System.out.println("������ڶ�������Ϊ" + length + "������");
		for (int j = 0; j < length; j++) {
			arr2[j] = s2.nextInt();
		}
		System.out.println(arrayMultiMin(arr1, arr2));
	}
	public static int arrayMultiMin(int arr1[], int arr2[]) {
		int sum= 0;
		int min=0;
		for (int i = 0; i <arr1.length; i++)
			for (int j = 0; j <arr2.length; j++) {
				sum += arr1[i] * arr2[j];		
				if (sum < min) {
					min = sum;
				} else if (sum < min)
					arrayMultiMin(arr1, arr2);
			}
		return min;
	}

}
