
public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 12, 23, 3, 4, 2, 43, 234, 35, 34, 56 };
		arraySort(arr);
		for (int a : arr) {// ��ǿforѭ����������Ԫ��
			System.out.print(" " + a);// ����������ż���������
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
		return (i & 0x1) == 0;// i��0x1��λȡ�룬ȡi�Ķ�������������֡����iΪ����ֵΪ1������Ϊ0
	}
}
