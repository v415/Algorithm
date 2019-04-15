package day0414;

import java.util.Scanner;

/**
 * ��������
 * @author lenovo
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();	//��
		int n = scan.nextInt();	//��

		int[][] arr = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		if(arr.length == 0 || arr[0].length == 0) {
			System.out.println(" ");
		}
		int num = Math.min(m, n)/2 + 1;	//����
		
		int p = m; 
		int q = n;
		
		
		for(int i=0;  i<num; i++, p -= 2, q -= 2) {
			//������
			for(int j=i; j<i+q; j++) {
				System.out.print(arr[i][j] + " ");
			}
			//���ϵ���
			for(int h=i+1; h<i+p; h++) {
				System.out.print(arr[h][i+q-1] + " ");
			}
			//���ֻʣ��һ�л���һ�У�������ѭ��
			if(q == 1 || p == 1)
				break;
			//���ҵ���
			for(int a=i+q-2; a>=i; a--) {
				System.out.print(arr[i+p-1][a] + " ");
			}
			//���µ���
			for(int b=i+p-2; b>i; b--) {
				System.out.print(arr[b][i] + " ");
			}
		}
	}
}
