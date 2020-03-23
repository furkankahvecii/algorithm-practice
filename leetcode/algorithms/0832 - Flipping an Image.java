/*
* https://leetcode.com/problems/flipping-an-image/
*/



class Solution 
{
	public static int[][] flipAndInvertImage(int[][] A) 
	{
		int[][] result = new int[A.length][A[0].length];
		for(int i=0;i<A.length;i++)
		{
			for(int j=A[i].length-1;j>=0;j--)
			{
				result[i][A[i].length-1-j] = A[i][j] > 0 ? 0:1;
			}
		}
		return result;
	}
}