/*
* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*/



import java.util.*;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer , Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i<numbers.length;i++)
		{
			int temp = target - numbers[i];
			
			if(map.containsKey(temp))
			{
				int sayi = map.get(temp);
				return new int[] {++sayi,++i};
			}
			else
			{
				map.put(numbers[i], i);
			}
		}
		return null;
    }
}
