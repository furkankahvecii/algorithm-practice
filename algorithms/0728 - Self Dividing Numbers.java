/*
* https://leetcode.com/problems/self-dividing-numbers/
*/



import java.util.*;

class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
	      List<Integer> result = new ArrayList<Integer>();
	      boolean decide=true;
	      for(int i=left;i<=right;i++)
	      {
	    	  int temp=i;
	    	  while(temp>1)
	    	  {
	    		  int mod = temp % 10;
	    		  if(mod==0 || i % mod !=0) decide=false;
	    		  temp/=10;
	    	  }
	 		  if(decide) result.add(i);
	 		  decide=true;
	      }     
	      return result;
	 }	 
}