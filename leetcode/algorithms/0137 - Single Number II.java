/*
* https://leetcode.com/problems/single-number-ii/
*/



import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-1;i++)
        {
        	if(nums[i] != nums[i+1])
        	{
        		if(i==0) return nums[i];
        		else if(i==nums.length-2) return nums[nums.length-1];
        		else if(nums[i+1] != nums[i+2])
        		{
        			return nums[i+1];
        		}
        	}
        }
        return nums[nums.length-1];
    }
}