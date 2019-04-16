import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumTwo {
	
   public static int [] twoSum(int [] nums,int target) {
	  Map<Integer,Integer> map=new HashMap<>();
	  for(int i=0;i<nums.length;i++) {
		  map.put(nums[i], i);
	  }
	  for(int i=0;i<nums.length;i++) {//这里的i也要重新定义为0
		  int complement=target-nums[i];
		  if(map.containsKey(complement)&&map.get(complement)!=i) {
			   return new int[] {i, map.get(complement)};
		  }
	  }
	  throw new IllegalArgumentException("No two sum solution!");
   }
   public static void main(String args[]) {
	   System.out.println("请输入一个整型数组和目标值：");
	   Scanner sc=new Scanner(System.in);
       int [] nums=new int[6];
       for(int i=0;i<nums.length;i++) {
    	   nums[i]=sc.nextInt();
       }
       System.out.println("请输入目标值：");
       
       int target=sc.nextInt();
       twoSum(nums,target);
       System.out.println("之和为："+ twoSum(nums,target));
   }
	 	   
}
