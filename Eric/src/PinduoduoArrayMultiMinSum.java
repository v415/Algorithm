import java.util.Scanner;

public class PinduoduoArrayMultiMinSum {
	/*
	 * �������ȶ�Ϊn��������������a[n]��b[n]����������S=a[0]*b[0] + ... + a[n-1]*b[n-1]��
	 * ����Ըı�a�����˳��ʹ������S�õ���ֵ��С���������յ���Сֵ�����鳤��n������50������ÿ��Ԫ��x��0<=X<=100�� ��������: һ�����С�
	 * ��һ��Ϊn����ʾ��������ĳ��ȡ� �ڶ��а���n�����֣��ÿո��������a�����ֵ�� �����а���n�����֣��ÿո��������b�����ֵ�� �������:
	 * ���һ�У�����һ�����֣���ʾ��С��Sֵ�� ʾ��1�������ʾ���������ԣ���̨��������һ�㲻����ʾ��
	 *  ����: 3 1 1 3 10 30 20 ���:80
	 */
	/* ͨ�����̽������ָ�����
	 * public static void main(String args[]) {
	    //����Integer���飬Ĭ��ֵΪ10��null
	   Integer[] readNums = new Integer[10];
	    //ʹ��Scanner��sytem in��
	   Scanner sca = new Scanner(System.in);
	   for(int i=0;i<10;i++){
	        //��ȡ���ַ�������ĵ�i��Ԫ��
	       readNums[i]=sca.nextInt();
	   }
	}*/
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		System.out.println("���������鳤��length��");
		int length = s1.nextInt();				
		int arr1[] = null;
		int arr2[]= null;
		System.out.println("�������һ�������ֵ���ö��ŷָ���");
		for(int i=0;i<length;i++) {		
			//int arr1num = s2.nextInt();
			//arr1[length]=arr1num;
			arr1[length]=s2.nextInt();
		}
		System.out.println("������ڶ��������ֵ���ö��ŷָ���");
		for(int j=0;j<length;j++) {	
			//int arr2num = s3.nextInt();
			//arr2[length]=arr2num;
			arr2[length]=s2.nextInt();
		}
		arrayMultiMin(arr1,arr2);
	}

	public static int arrayMultiMin(int arr1[], int arr2[]) {
		int S = 0;		
		for (int i = 0; i <= arr1.length; i++)
			for (int j = 0; j <= arr2.length; j++) {
				S += arr1[i] * arr2[j];
			}
		return S;
	}

}
