/*
 * https://leetcode.com/problems/is-subsequence/
*/



class Solution {
	public boolean isSubsequence(String s, String t) 
	{
		int jIndex = 0, match = 0;
	   	for(int i = 0; i <s.length();i++) {
		   for(int j = jIndex ; j<t.length();j++) {
			   if(s.charAt(i) == t.charAt(j)) {
				   jIndex++;
				   match++;
				   break;
			   }
			   jIndex++;
		   }
	   }
	   
	   return match == s.length() ? true : false;
	}
}
