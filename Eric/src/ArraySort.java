
public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 12, 23, 3, 4, 2, 43, 234, 35, 34, 56 };
		arraySort(arr);
		for (int a : arr) {// 增强for循环遍历数组元素
			System.out.print(" " + a);// 按奇数在左，偶数在右输出
		}

	}

	private static void arraySort(int array[]) {
		if (array == null) {
			return;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			while (left < right && !isEven(array[left])) {
				left++;
			}
			while (left < right && isEven(array[right])) {
				right--;
			}
			if (left < right) {
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
			}
			if (left >= right) {
				break;
			}
		}

	}

	private static boolean isEven(int i) {
		return (i & 0x1) == 0;// i与0x1按位取与，取i的二进制最后面数字。如果i为奇数值为1，否则为0
	}
}
