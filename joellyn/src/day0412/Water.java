package day0412;

import java.util.Scanner;

/**
 * 盛最多水的容器
 * @author lenovo
 *
 */
public class Water {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		arr[0] = 0;
		for(int i=1; i<=n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int temp1 = 1;
		int temp2 = n;
		int range = 0;
		int maxRange = 0;
		while(temp1 != temp2) {
			if(arr[temp1] <= arr[temp2]) {
				range = arr[temp1] * (temp2 - temp1);
				temp1++;
			}else {
				range = arr[temp2] * (temp2 - temp1);
				temp2--;
			}
			if(range > maxRange) {
				maxRange = range;
			}
		}
		
		System.out.println(maxRange);
	}
}
