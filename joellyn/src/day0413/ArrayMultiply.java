package day0413;

import java.util.Scanner;

/**
 * 除自身以外数组的乘积
 * @author lenovo
 *
 */
public class ArrayMultiply {
	
	public static int[] foreArray(int[] arr) {
		int[] arr1 = new int[arr.length];
		arr1[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr1[i] = arr[i] * arr1[i-1];
		}
		return arr1;
		
	}
	
	public static int[] nextArray(int[] arr) {
		int[] arr2 = new int[arr.length];
		arr2[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			arr2[i] = arr2[i+1] * arr[i];
		}
		return arr2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] multiArr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int[] forArr = foreArray(arr);
		int[] nexArr = nextArray(arr);
		multiArr[0] = nexArr[1];
		System.out.print(multiArr[0] + " ");
		for(int i=1; i<n-1; i++) {
			multiArr[i] = forArr[i-1] * nexArr[i+1];
			System.out.print(multiArr[i] + " ");
		}
		multiArr[n-1] = forArr[n-2];
		System.out.print(multiArr[n-1] + " ");
	}
}
