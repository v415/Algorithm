
import java.util.ArrayList;
public class HuaweiTest1 {
	public static ArrayList<Integer> merge(int[][] a,int n) {
		//二维数组的宽
		int alength = a.length;
		//长
		int blength = a[0].length;
		//int[] merge = new int[blength*alength];
		ArrayList<Integer> arr = new ArrayList();
		int j=0;
		while(j<a[0].length) {
			for(int i=0;i<alength;i++) {
				merge1(arr,a[i],j,j+n);
			}
			j=j+n;
		}
		return arr;
	}

	private static void merge1(ArrayList<Integer> arr, int[] is, int i, int j) {
		for(;i<j;i++) {
			arr.add(is[i]);
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		ArrayList<Integer> al = merge(a,3);
		for(int i :al) {
			System.out.println(i);
		}
	}
}

