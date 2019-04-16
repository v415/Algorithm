package array;

import java.util.Scanner;

/**
 * 旋转数组
 * 	输入: [1,2,3,4,5,6,7] 和 k = 3
	输出: [5,6,7,1,2,3,4]
	解释:
	向右旋转 1 步: [7,1,2,3,4,5,6]
	向右旋转 2 步: [6,7,1,2,3,4,5]
	向右旋转 3 步: [5,6,7,1,2,3,4]
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
			//防止陷入死循环 eg: 1,2 3,4  k=2
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
