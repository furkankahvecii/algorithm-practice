/*
 * https://leetcode.com/problems/rotate-string/
 */



class Solution 
{
	public static boolean rotateString(String A, String B)
	{
		if (A == null || B == null || A.length() != B.length()) return false;
		if (A.equals("") && B.equals("")) return true;
		
		String b = A + A;
		
		if(b.indexOf(B) !=-1)
			return true;
		else
			return false;
	}
}