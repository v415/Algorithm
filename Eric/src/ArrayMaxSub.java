
public class ArrayMaxSub {

	public static void main(String[] args) {
		//����һ���������飬������Ҳ�и�����������һ�������������������һ�������飬������ֵ��
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
