/*
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
*/



class Solution {
	public static int countNegatives (int[][] grid) {
		int count =0;
		for(int i=0;i<grid.length;i++) {
			for(int j=grid[i].length-1;j>=0;j--)
			{
				 if(grid[i][j]>=0)
					break;
				 else
					count++;
			}
		}
		return count;
	}
}