/*
 * https://leetcode.com/problems/binary-search/
*/


import java.util.*;

class Solution 
{
    public int search(int[] nums, int target) 
    {
        Arrays.sort(nums);
		int mid = nums.length / 2;
		
		int low = 0;
		int high = nums.length-1;
		
		while(low <= high)
		{
			if(target == nums[mid])
				return mid;
			if(target < nums[mid])
			{
				high = mid-1;
			}
			else
				low = mid+1;
			
			mid = (low + high ) /2;
		}
		
		return -1;
    }
}