import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SumThree {
	public ArrayList<ArrayList<Integer>> sumThree(int[] nums){
	ArrayList<ArrayList<Integer>> my = new ArrayList<>();
    Arrays.sort(nums);//先排序数组
    for(int i=0;i<=nums.length-3;i++)
        if(nums[i]<=0){
            if(i>=1 && nums[i]==nums[i-1])
                continue;               
            int j=i+1;
            int k=nums.length -1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0)
                {
                    List<Integer> one = new ArrayList<>();
                    one.add(nums[i]);
                    one.add(nums[j]);
                    one.add(nums[k]);
                    my.add((ArrayList<Integer>) one);    
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                        j++;
                    while(j<k && nums[k]==nums[k+1])
                        k--;
                }

                else {
                    boolean flag =true;
                    // 求有序数组中两个数的和为(-1)*nums[i]
                    while(flag){
                        while(j<k && nums[j]+nums[k]>(-1)*nums[i])
                            k--;
                        while(j<k && nums[j]+nums[k]<(-1)*nums[i])
                            j++;
                        if( j>=k || nums[j]+nums[k]==(-1)*nums[i])
                            flag = false;
                    }
                }

            }   // while(j<k)

        }

    return my;
	}
}

