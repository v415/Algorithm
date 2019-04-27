package ad.sort.basic2;

import java.util.Arrays;

import ad.sort.basic.SortTestHelper;

public class QuickSort {
	public static void  sort(Comparable [] arr){
		int n=arr.length;
		quickSort(arr,0,n-1);
	}

	private static void quickSort(Comparable[] arr, int l, int r) {
		if (l>=r) {
			return;
		}
		/*int i,j=l;
		Comparable v=arr[l];
		for(i=l+1;i<=r;i++) {
			if (arr[i].compareTo(v)<0) {
				swap(arr, i, j+1);
				j++;
			}
			swap(arr, l, j);
		}*/
		int j=partition2(arr, l, r);
		quickSort(arr, l,j-1);
		quickSort(arr, j+1,r);
	}
		private static void swap(Object[] arr, int i, int j) {
			Object temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		public static void main(String[] args) {
			int N = 10000;

			 //Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
			 Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 100);
		     Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);

		     //SortTestHelper.testSort("ad.sort.basic2.MergeSort", arr1);
		     SortTestHelper.testSort("ad.sort.basic2.InsertionSort", arr1);
		     SortTestHelper.testSort("ad.sort.basic2.QuickSort", arr2);
		}
		private static int partition(Comparable[] arr,int l,int r) {
			
			swap(arr, l, (int)(Math.random()*(r-l+1))+1);
			Comparable v= arr[l];
			int j=l+1;
			
			for (int i = l; i <= r; i++) {
				if (arr[i].compareTo(v)<0) {
					swap(arr, i, j+1);
					j++;
				}
				swap(arr, i, j);
			}
			return j;
			
		}
private static int partition2(Comparable[] arr,int l,int r) {
			
			swap(arr, l, (int)(Math.random()*(r-l+1))+1);
			Comparable v= arr[l];
			
			int i=l+1,j=r;
			while (true) {
				while(i<=r&&arr[i].compareTo(v)<0) i++;
				while (j>=l+1 && arr[j].compareTo(v)>0) j--; 
				if (i>j) 
					break;
				swap(arr, i, j);
				i++;
				j--;
			}
			
			
			return j;
			
		}

}
