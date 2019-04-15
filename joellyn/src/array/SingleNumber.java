package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.OMGVMCID;

/**
 * 只出现一次的数字
 * @author lenovo
 * 1、排序，比较nums[i]与nums[i+1]
 * 2、HashSet去重法
 * 3、排序，数组下标，所有奇数下标的元素之和减去偶数下标元素之和
 * 4、异或法
 *
 */
public class SingleNumber {

	public static int[] ArrayChange(String[] strr) {
		int[] nums = new int[strr.length];
		for(int i=0; i<strr.length; i++) {
				nums[i] = Integer.parseInt(strr[i]);
		}
		return nums;
	}
	
	//1、比较法
	public static int Method1(int[] nums) {
		
		Arrays.sort(nums);
		
		//输入数字个数为奇数
		for(int j=0; j<nums.length-1; j+=2) {
			if(nums[j] != nums[j+1]) {
					return nums[j];
			}
		}
		return nums[nums.length-1];
	}
	
	//2、去重法
	public static int Method2(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<nums.length; i++) {
			if(!set.add(nums[i])) {
				set.remove(nums[i]);
			}
		}
		return set.iterator().next();
		
	}
	
	//3、求差法
	public static int Method3(int[] nums) {
		Arrays.sort(nums);
		int temp = 0;
		for(int i=0; i<nums.length; i++) {
			temp = (i % 2 == 0) ? temp + nums[i] : temp - nums[i];
		}
		
		return temp;
	}
	
	//4、异或法
	public static int Method4(int[] nums) {
		int temp = 0;
		for(int i=0; i<nums.length; i++) {
			temp = temp ^ nums[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		String[] strr = string.split(",");
		int[] nums = ArrayChange(strr);
//		System.out.println(Method3(nums));
		System.out.println(Method4(nums));
	}
}
