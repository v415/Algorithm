package ad.search.binaryTree;

public class BinarySearch {
	/**
	 * 二分查找
	 * @param arr
	 * @param target
	 * @return
	 */
	public int search(int []arr,int target) {
		int n=arr.length, l=0, r=n-1;
		
		while (l<=r) {
			int mid=r-(r-l)/2; //这样可以避免（l+r）带来的越界问题
			if (arr[mid]==target) {
				return mid;
			}else if (arr[mid]<target) {
				r=mid-1;
			}else {
				l=mid+1;
			}
		}
		return -1;
	}
	/**
	 * 二分查找的递归实现
	 * @param arr
	 * @param target
	 * @return
	 */
	public int searchD(int []arr,int target) {
		int n=arr.length;
		return searchD(arr,0,n-1, target);
	}
	private int  searchD(int[] arr, int l, int r, int target) {
		
		int mid=r-(r-l)/2; //这样可以避免（l+r）带来的越界问题
		
		if (arr[mid]==target) {
			return mid;
		}else if (arr[mid]<target) {
			searchD(arr, l, mid-1, target);
		}else {
			searchD(arr, mid+1, r, target);
		}
	return -1;
	}
}
