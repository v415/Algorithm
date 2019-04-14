package day0414;

import java.util.Scanner;

/**
 * 螺旋矩阵
 * @author lenovo
 *
 */
public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();	//行
		int n = scan.nextInt();	//列

		int[][] arr = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		if(arr.length == 0 || arr[0].length == 0) {
			System.out.println(" ");
		}
		int num = Math.min(m, n)/2 + 1;	//环数
		
		int p = m; 
		int q = n;
		
		
		for(int i=0;  i<num; i++, p -= 2, q -= 2) {
			//从左到右
			for(int j=i; j<i+q; j++) {
				System.out.print(arr[i][j] + " ");
			}
			//从上到下
			for(int h=i+1; h<i+p; h++) {
				System.out.print(arr[h][i+q-1] + " ");
			}
			//如果只剩下一行或者一列，则跳出循环
			if(q == 1 || p == 1)
				break;
			//从右到左
			for(int a=i+q-2; a>=i; a--) {
				System.out.print(arr[i+p-1][a] + " ");
			}
			//从下到上
			for(int b=i+p-2; b>i; b--) {
				System.out.print(arr[b][i] + " ");
			}
		}
	}
}
