/*
* https://leetcode.com/problems/valid-palindrome/
*/



class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      int l =0;
	  int r = s.length()-1;
		while (l < r)
		{
			while( l < r && !Character.isLetter(s.charAt(l)) && !Character.isDigit(s.charAt(l)))
			{
				l++;
			}
			while( l < r && !Character.isLetter(s.charAt(r)) && !Character.isDigit(s.charAt(r)))
			{
				r--;
			}
			if(s.charAt(l) != s.charAt(l))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
    }
}