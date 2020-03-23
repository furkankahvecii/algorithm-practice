/*
* https://leetcode.com/problems/array-partition-i/
*/



import java.util.*;

class Solution 
{
    public int arrayPairSum(int[] nums) 
    {
        Arrays.sort(nums);
		int sum =0;
		for(int i=0;i<nums.length-1;i++)
		{
			sum+=nums[i];
            i++;
		}
		return sum;
    }
}