/*
* https://leetcode.com/problems/sum-of-two-integers/
*/



class Solution 
{
    public int getSum(int a, int b) {
        int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		while(min!=0)
		{
			if(min<0) 
			{
				max--;
				min++;
			}
			else{
				max++;
				min--;
			}	
		}
		
		return max;
    }
}