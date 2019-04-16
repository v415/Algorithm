
public class Offer38 {
	// 统计一个数字在排序数组中出现的次数，如：输入数组{1,2,3，3,3,4,5}和3，则输出3
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 3, 3, 4, 5 };
		System.out.println(getNumberOfK(array, 3));
	}

	private static int getNumberOfK(int array[], int k) {
		int num = 0;// 定义出现次数，初始值为0
		if (array != null) {
			int first = getFirstK(array, k, 0, array.length - 1);
			int last = getLastK(array, k, 0, array.length - 1);

			if (first > -1 && last > -1) {
				num = last - first + 1;
			}
		}
		return num;
	}

	private static int getLastK(int array[], int k, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;

		int midData = array[mid];
		if (midData == k) {
			if ((mid < array.length - 1 && array[mid + 1] != k) || mid == array.length - 1) {
				return mid;
			} else {
				start=end+1;
			}
		}
		else if (k > midData) 
			start = mid + 1;// k在后半部分，所以前指针指到mid后一位。即范围跳到后半部分
		else
			end = mid - 1;// k在前半部分，所以后指针指到mid前一位
		return getLastK(array, k, start, end);

	}

	private static int getFirstK(int array[], int k, int start, int end) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		int midData = array[mid];
		if (midData == k) {
			if ((mid > 0 && array[mid - 1] != k) || mid == 0) {
				return mid;
			} else {
				end = mid - 1;
			}
		} else if (midData > k) {
			end = mid - 1;
		} else
			start = end + 1;
		return getFirstK(array, k, start, end);
	}

}
