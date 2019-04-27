package ad.sort.basic;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(Comparable[] arr) {
		int n=arr.length;
		for (int i = 1; i < arr.length; i++) {
			//一般方法1
			/*for (int j = i; j >0; j--) {
				if (arr[j].compareTo(arr[j-1])<0) {
					swap(arr, j-1, j);
				}else {
					break;
				}
			}*/
			//改进方法
			Comparable e=arr[i];
			int j;
			for ( j = i; j >0 &&arr[j-1].compareTo(e)>0; j--) {
				arr[j]=arr[j-1];
			}
			arr[j]= e;
		}
	}
	 // 对arr[l...r]的区间使用InsertionSort排序
    public static void sort(Comparable[] arr, int l, int r){

        for( int i = l + 1 ; i <= r ; i ++ ){
            Comparable e = arr[i];
            int j = i;
            for( ; j > l && arr[j-1].compareTo(e) > 0 ; j--)
                arr[j] = arr[j-1];
            arr[j] = e;
        }
    }
/*	private static void swap(Object[] arr, int i, int j) {
		Object temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}*/
	public static void main(String[] args) {
		  int n=10000;
	       
	        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(n, 1000);
	        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);

	        SortTestHelper.testSort("ad.sort.basic.SelectionSort", arr1);
	        SortTestHelper.testSort("ad.sort.basic.InsertionSort", arr2);

	        System.out.println();
	}
		
}
