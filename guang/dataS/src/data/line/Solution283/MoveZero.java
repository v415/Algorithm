package data.line.Solution283;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import data.set.Set;

public class MoveZero {
	public static void moveZeroes(int[] nums) {
		int n=nums.length;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				list.add(nums[i]);
			}
		}
		
		for(int i=0;i<list.size();i++) {
			nums[i]=list.get(i);	
			}
		for(int i=list.size();i<n;i++) {
			nums[i]=0;
		}
		}
	public static void moveZeroes2(int[] nums) {
		int n=nums.length,k=0;
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				nums[k]=nums[i];
				k++;
			}
		}
		for(int i=k;i<n;i++)
			nums[i]=0;
		}
	 public int removeElement27(int[] nums, int val) {
		 int n=nums.length;
		 int k=n-1;
		 
		 for (int i = 0; i <=k; ) {
			 if (nums[i]==val) 
                 nums[i]=nums[k--];
             else
                 i++;
		}
		return k+1;
	        
	    }
	 public int removeElement26(int[] nums) {
		 int n=nums.length;
		 int k=0;
		 
		 for (int i = 0; i <n;i++ ) {
			 
			 for (int j = n; j >i; j--) {
				if (nums[i]==nums[j]) {
					
				}
			} 
		}
		 
		return k+1;
	        
	    }

	 public void sortColors(int[] nums) {
		 int zero=0,one=0,two=0;
	        for (int i = 0; i < nums.length; i++) {
				if (nums[i]==0) {
					zero++;
				}else if (nums[i]==1) {
					one++;
				}else if (nums[i]==2) {
					two++;
				}
			}
	        int count=0;
	        for(int i=0;i<zero;i++)
	        	nums[count++]=0;
	        for(int i=0;i<one;i++)
	        	nums[count++]=1;
	        for(int i=0;i<two;i++)
	        	nums[count++]=2;
	    }
	 public void sortColors1(int[] nums) {
		 int [] count = {0,0,0};
	        for (int i = 0; i < nums.length; i++) {
				count[nums[i]]++;
			}
	        int index=0;
	        for(int i=0;i<count[0];i++)
	        	nums[index++]=0;
	        for(int i=0;i<count[1];i++)
	        	nums[index++]=1;
	        for(int i=0;i<count[2];i++)
	        	nums[index++]=2;
	    }
	 public void sortColors2(int[] nums) {
		 int n=nums.length;
		 int zero=-1,two=n;
		 for (int i = 0; i < two; ) {
			if (nums[i]>1) {
				swap(nums, i, --two);
			}
			if (nums[i]<1) {
				swap(nums, i, ++zero);
				i++;
			}
			i++;
		}
	        
	    }
	 public void sortColors3(int[] nums) {
		Arrays.sort(nums);
	        
	    }
	 public void minSubArrayLen(int[] nums) {
		 int n=nums.length;
		 int l=0,r=-1;
		 int res=n+1;
		 while(l<n) {
			 
		 }
		 
	 }
		private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		int [] nums= {0,1,0,3,12};
		moveZeroes2(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" , ");
		}
	}
}
