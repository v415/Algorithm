
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
		        //��¼����������һ����Ӧ�÷��ڵ�λ��,��ʼ����start,
		        //��Ϊ���ǰ��û���������һ������,��ô�������������һ������Ӧ�÷���start��λ��
		        for (int j = start; j <= end - 1; j++) { 
		        	//������Ŀ���ǰѲ���������������б����һ������������ŵ����һ����ǰ��
		            if (a[j] >= x) {
		                swap(a, i, j);  
		                i++;  
		                //ÿ����һ�������һ���������,���һ����Ӧ�÷ŵ�λ�þ�+1
		            }
		        }
		        swap(a, i, end); 
		        //����һ������Ͱ����һ������������ȷ��λ��,������ߵ����������һ������,�ұߵ����������һ����С
		        return i;
		    }	   
		    	 private static void swap(int[] a, int i, int j) {
		    	        int tmp = a[i];
		    	        a[i] = a[j];
		    	        a[j] = tmp;
		    	    }
}
