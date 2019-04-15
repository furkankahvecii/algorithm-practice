/*
* https://leetcode.com/problems/happy-number/
*/



class Solution {
	public boolean isHappy(int n) 
	{
		List<Integer> array = new ArrayList<Integer>();
		int asiltoplam=0;
		while(n>0)
		{
			asiltoplam += (int) Math.pow(n%10, 2);
			n=n/10;		
			if(n==0)
			{		
				if(asiltoplam==1) return true;
				else
				{
					if(!array.contains(asiltoplam))
					{
						array.add(asiltoplam);
						n=asiltoplam;
						asiltoplam=0;
					}
					else 
						return false;
				}
			}	
		}
		return false;
	}
}