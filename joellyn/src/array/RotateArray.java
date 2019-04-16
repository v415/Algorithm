package array;

import java.util.Scanner;

/**
 * ��ת����
 * 	����: [1,2,3,4,5,6,7] �� k = 3
	���: [5,6,7,1,2,3,4]
	����:
	������ת 1 ��: [7,1,2,3,4,5,6]
	������ת 2 ��: [6,7,1,2,3,4,5]
	������ת 3 ��: [5,6,7,1,2,3,4]
 * @author lenovo
 *
 */
public class RotateArray {

	public static int[] Method1(int[] nums, int k) {
		int[] arr = new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			arr[(k+i)% nums.length] = nums[i];
		}
		return arr;
	}
	
	public static int[] Method2(int[] nums, int k) {
		if(nums.length == 0)
			return nums;
		int start = 0;
		int idx = 0;
		int pre = 0;
		int cur = nums[0];
		for(int i=0; i<nums.length; i++) {
			pre = cur;
			idx = (idx + k) % nums.length;
			cur = nums[idx];
			nums[idx] = pre;
			//��ֹ������ѭ�� eg: 1,2 3,4  k=2
			if(idx == start) {
				idx = ++start;
				cur = nums[idx];
			}
		}
		
		return nums;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String[] str = string.split(",");
		int[] arr = new int[str.length];
		for(int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int k = scan.nextInt();
		arr = Method1(arr, k);
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
