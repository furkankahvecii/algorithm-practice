/*
* https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/
*/



class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long mod = (int)1e9 + 7, elements = 0, res = 0;
		    List<Long> array = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
        	array.add((long)nums[i]);
        	elements = nums[i];
        	for(int j=i+1;j<nums.length;j++)
        	{
        		array.add((elements+=nums[j]));
        	}
        }
        Collections.sort(array);
        
        while(left <= right) { res = (res + ( array.get(left++ -1) ))% mod; }
		    return (int) res;
    }
}
