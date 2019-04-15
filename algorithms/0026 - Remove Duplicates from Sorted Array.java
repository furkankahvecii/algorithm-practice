/*
* https://leetcode.com/problems/remove-duplicates-from-sorted-array/
*/



class Solution {
	public static int removeDuplicates(int[] nums)
	{
		if(nums.length==0) return 0;
		int count=0;
		int shift=1;
		for(int i=0;i<nums.length;i+=shift)
		{
			shift=1;
			for(int j=i+1;j<nums.length;j++)
			{
				if(j <nums.length &&  nums[j] == nums[i]  )
				{
					count++;	
					shift++;			
				}
				else
				{
					nums[j-count-1]=nums[i];
					break;
				}	
			}		
		}
		nums[nums.length - count -1 ] = nums[nums.length-1];
		return nums.length - count;
	}
}