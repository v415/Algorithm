package ad.sort.advanced;

import java.util.Arrays;

import ad.sort.basic.SortTestHelper;

public class MergeSort {
	public static void sort(Comparable[] arr) {
		int n=arr.length;
		mergeSort(arr,0,n-1);
	}

	private static void mergeSort(Comparable[] arr, int l, int r) {
		if (l>=r) {
			return;
		}
		int mid=(l+r)/2;
		mergeSort(arr, l, mid);
		mergeSort(arr, mid+1, r);
		if (arr[mid].compareTo(arr[mid+1])>0) {
			merge(arr, l,mid, r);
		}
		
	}

	private static void merge(Comparable[] arr, int l, int mid, int r) {
		Comparable[] aux = Arrays.copyOfRange(arr, l, r+1);
		int i=l,j=mid+1;
		for(int k=l;k<=r;k++) {
			if (i>mid) {
				arr[k]=aux[j-l];
				j++;
			}else if (j>r) {
				arr[k]=aux[i-l];
				i++;
			}else if (aux[i-l].compareTo(aux[j-l])<0) {
				arr[k]=aux[i-l];
				i++;
			}else {
				arr[k]=aux[j-l];
				j++;
			}
		}
	}

    // 测试InsertionSort
    public static void main(String[] args) {

        int N = 20000;

        /*Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 0);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);

        SortTestHelper.testSort("ad.sort.advanced.MergeSort", arr1);
        SortTestHelper.testSort("ad.sort.basic2.InsertionSort", arr2);*/
        Integer[] arr1= {6,5,4,3,2,1,7,8};
        sort(arr1);
        for (Integer integer : arr1) {
        	 System.out.print(integer+",");
		}
       

        return;
    }

}
