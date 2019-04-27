package data.line.minSubArrayLen209;

public class Solution {
public int minSubArrayLen(int s, int[] nums) {
	int res=nums.length+1;
	int l=0,r=-1,sum=0;
	while(l<nums.length) {
		if (r+1<nums.length && sum<s) {
			sum+=nums[++r];
		}else {
			sum-=nums[r++];
		}
		if (sum>=s) {
			res=Math.min(res, r-l+1);
		}
		if (res==nums.length+1) {
			return 0;
		}
	}
	
	return res;
        
    }

}
