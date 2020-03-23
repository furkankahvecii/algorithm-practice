/*
 * https://leetcode.com/problems/majority-element/
 */



class Solution {
    public int majorityElement(int[] nums) {
    	Map<Integer,Integer> map = new HashMap<>();
		
		for(int a : nums)
		{
			if(map.containsKey(a))
			{
				map.put(a, map.get(a) + 1);
			}
			else
				map.put(a,1);
		}

		for(int i = 0 ; i < nums.length;i++)
		{
			if(map.get(nums[i]) > (nums.length / 2))
				return nums[i];
		}
		return 0;
    }
}
