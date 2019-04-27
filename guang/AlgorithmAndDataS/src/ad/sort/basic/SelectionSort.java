package ad.sort.basic;
/**
 * 选择排序算法
 * @author yzg
 *
 */
public class SelectionSort {

	public static void sort(Comparable[] arr) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			// 寻找[i，n)区间的最小值
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			swap(arr,i,minIndex);
		}
	}

	private static void swap(Object[] arr, int i, int j) {
		Object temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	/*
	 * private void swap(T t1, T t2) { T stmp=t1; t1=t2; t2=stmp; }
	 */
	public static void main(String[] args) {
		Integer[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		sort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
        String[] b = { "d","c","b","a" };
		sort(b);
        for( int i = 0 ; i < b.length ; i ++ ){
            System.out.print(b[i]);
            System.out.print(' ');
        }
        System.out.println();
        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D",90);
        d[1] = new Student("C",100);
        d[2] = new Student("B",95);
        d[3] = new Student("A",95);
        SelectionSort.sort(d);
        for( int i = 0 ; i < d.length ; i ++ )
            System.out.println(d[i]);
        
        int n=10000;
        SortTestHelper helper = new SortTestHelper();
        Integer[] a1 = helper.generateRandomArray(n, 0, 1000);
        helper.testSort("ad.sort.basic.SelectionSort", a1);
		
        System.out.println();
	}

}
