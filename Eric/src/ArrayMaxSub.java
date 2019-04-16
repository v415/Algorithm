
public class ArrayMaxSub {

	public static void main(String[] args) {
		//输入一个整数数组，有正数也有负数。数组中一个或连续多少整数组成一个字数组，输出最大值。
          int arr[]={2,3,-4,5,-6,8,-2,8,-3,9,6};
          System.out.println(maxSub(arr));
	}

	private static int maxSub(int[] arr) {
		int max = 0;
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum > max) {
				max = sum;
			} else if (sum < max)
				sum = 0;
		}
		return max;
	}

}
