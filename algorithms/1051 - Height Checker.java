/*
* https://leetcode.com/problems/height-checker/
*/



class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOf(heights, heights.length);
		int count=0;
		Arrays.sort(copy);
		
		for(int i=0;i<copy.length;i++)
		{
			count=heights[i] != copy[i] ? ++count:count;
		}
		return count;
    }
}