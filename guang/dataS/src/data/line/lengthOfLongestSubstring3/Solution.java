package data.line.lengthOfLongestSubstring3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import data.set.Set;

public class Solution {
	  public int lengthOfLongestSubstring(String s) {
		int[] freq = new int[256];
		int res=0;
		int l=0,r=-1;
		while(l<s.length()) {
			if (r+1<s.length()&& freq[s.charAt(r+1)]==0) {
				freq[s.charAt(++r)]++;
			}else {
				freq[s.charAt(l++)]--;
			}
			
			res=Math.max(res, r-l+1);
		}
		return res;
	        
	    }
	  
	  
	  public int[] intersection349(int[] nums1, int[] nums2) {
		Set<Integer> record = (Set<Integer>) new TreeSet<>();
		for(int num:nums1)
			record.add(num);
		Set<Integer> resultSet = (Set<Integer>) new HashSet<>();
		for (int i = 0; i < nums2.length; i++) {
			if (record.contains(nums2[i])) {
				resultSet.add(nums2[i]);
			}
		}
		int res[] =new int[resultSet.getSize()];
		//resultSet.toArray(res);
		for (int i = 0; i < resultSet.getSize(); i++) {
		//	res[i]=resultSet.toArray
		}
		  
		return nums2;
	        
	    }
}
