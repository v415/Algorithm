package ad.sort.advanced;

import ad.sort.basic.InsertionSort;

public class QuickSort {
	public static void sort(Comparable[] arr){

        int n = arr.length;
        sort(arr, 0, n-1);
    }
	// 递归使用快速排序,对arr[l...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r) {
    	// 对于小规模数组, 使用插入排序
        if( r - l <= 15 ){
            InsertionSort.sort(arr, l, r);
            return;
        }
     // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap( arr, l , (int)(Math.random()*(r-l+1))+l );
        Comparable v = arr[l];
        
        int j=l;
        for(int i=l+1;i<=r;i++) {
        	if (arr[i].compareTo(v)<0) {
				swap(arr, i, j+1);
				j++;
			}
        }
        swap(arr, l, j);

       // int p = partition(arr, l, r);
        int p = j;
        sort(arr, l, p-1 );
        sort(arr, p+1, r);
	}
    
    // 对arr[l...r]部分进行partition操作
    // 返回p, 使得arr[l...p-1] < arr[p] ; arr[p+1...r] > arr[p]
	private static int partition(Comparable[] arr, int l, int r) {
		// 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap( arr, l , (int)(Math.random()*(r-l+1))+l );
        Comparable v = arr[l];
        
        int j=l,i=l+1;
        for(;i<=r;i++) {
        	if (arr[i].compareTo(v)<0) {
				swap(arr, i, j+1);
				j++;
			}
        }
        swap(arr, l, j);
        
		return j;
	}
	private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
	private int part(Comparable[] arr, int l, int r) {
		Comparable v =arr[l];
		int j=l;
		for(int i=l+1; i<=r;i++) {
			if (arr[i].compareTo(v)<0) {
				j++;
				swap(arr, i, j);
			}
		}
		swap(arr, l, j);
		return r;
		
	}
}
