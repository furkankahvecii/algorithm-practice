/*
* https://leetcode.com/problems/find-the-difference/
*/



class Solution 
{
    public char findTheDifference(String s, String t) 
    {
         int ans =0;
	     for(char q : t.toCharArray())
	    	 ans+=(int)q;
	     for(char q : s.toCharArray())
	    	 ans-=(int)q;
	     return (char)ans;
    }
}