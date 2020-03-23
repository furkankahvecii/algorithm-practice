/*
 * https://leetcode.com/problems/two-sum/
*/



class Solution {
	public static int[] twoSum(int[] nums, int target) 
	{
		int[] sonuc=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					sonuc[0]=i; 
					sonuc[1]=j;
					break;
				}
			}
		}
		return sonuc;
	}
}
