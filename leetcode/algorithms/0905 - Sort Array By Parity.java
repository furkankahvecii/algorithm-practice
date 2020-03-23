/*
* https://leetcode.com/problems/sort-array-by-parity/
*/



class Solution 
{
	public int[] sortArrayByParity(int[] A) 
	{
		if(A.length==0 || A == null) return A;
		int l=0;
		int r=A.length-1;
		int temp=0;
		
		while(l<r)
		{
			if(A[l]%2==0)
        	{
        		l++;
        		continue;
        	}
        	if(A[r]%2==0)
        	{
        		temp = A[l];
        		A[l] = A[r];
        		A[r] = temp;
        		l++;
        		r--;
        	}
        	else
        		r--;
		}
		return A;
	}
}