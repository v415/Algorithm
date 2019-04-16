
public class QuickSort {	
		    public static void main(String[] args) {
		        int[] a = { 2, 4, 6, 8, 3, 6, 9, 12 };
		        quickSort(a, 0, a.length - 1);
		        for (int i = 0; i <= a.length - 1; i++)
		            System.out.print(a[i] + " ");
		    }		 
		    private static void quickSort(int[] a, int start, int end) {
		        if (start < end) {
		            int p = core(a, start, end);
		            quickSort(a, start, p - 1);
		            quickSort(a, p + 1, end);
		        }
		    }		 
		    private static int core(int[] a, int start, int end) {
		        int x = a[end];
		        int i = start; 
		        //记录遍历完后最后一个数应该放在的位置,初始就是start,
		        //因为如果前面没有数比最后一个数大,那么下面遍历完后最后一个数就应该放在start的位置
		        for (int j = start; j <= end - 1; j++) { 
		        	//遍历的目的是把参与排序的这轮数中比最后一个数大的数都放到最后一个数前面
		            if (a[j] >= x) {
		                swap(a, i, j);  
		                i++;  
		                //每遇到一个比最后一个数大的数,最后一个数应该放的位置就+1
		            }
		        }
		        swap(a, i, end); 
		        //这里一交换后就把最后一个数放在了正确的位置,这样左边的数都比最后一个数大,右边的数都比最后一个数小
		        return i;
		    }	   
		    	 private static void swap(int[] a, int i, int j) {
		    	        int tmp = a[i];
		    	        a[i] = a[j];
		    	        a[j] = tmp;
		    	    }
}
