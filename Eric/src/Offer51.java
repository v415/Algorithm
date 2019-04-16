
public class Offer51 {
//在一个长度为n的数组里，所有数字都在0到n-1范围内，找出数组中任意一个重复的数字
	public static void main(String[] args) {
		int numbers[]= {1,2,3};
		int duplication[]=new int[3];
		boolean result=duplicate(numbers,3,duplication);
		System.out.println(result);
	}
   public static boolean duplicate(int numbers[],int length,int [] duplication) {
	   if(numbers==null||length==0||length==1) {
		   return false;
	   }
	   for(int i=0;i<length;i++) {
		   int index=numbers[i];
		   if(index>=length)
			   index -=length;
		   if(numbers[index]>=length) {
			   duplication[0]=index;
			   return true;
		   }
		   numbers[index] +=length;
	   }
	   return false;
   }
}
