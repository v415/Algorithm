package ch2;


public class Review10 {
	public int minNumberInRotateArray(int [] array) {
		if(array==null || array.length==0)
			return 0;
		int index1=0;
		int index2=array.length-1;
		int indexMid=index1;
		
		while (array[index1]>=array[index2]) {
			if (index2-index1==1) {
				indexMid=index2;
				break;
			}
			indexMid=(index1+index2)/2;
			if (array[index1]==array[index2] && array[index1]==array[indexMid]) {
				return minInOrder(array,index1,index2);
			}
			if (array[indexMid]>=array[index1]) {
				index1=indexMid;
			}
			else if (array[indexMid]<=array[index2]) {
				index2=indexMid;
			}
		}
		
		return array[indexMid];
	    
    }

	private int minInOrder(int[] array, int index1, int index2) {
		int result=array[index1];
		for (int i = index1+1; i <= index2 && array[i]>result; i++) {
				result=array[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		int [] array= {3,4,5,1,2};
		int min=new Review10().minNumberInRotateArray(array);
		System.out.println(min);
	}
}
