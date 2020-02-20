/*
 * https://leetcode.com/problems/break-a-palindrome/
 */


public class Solution {
	
	public String breakPalindrome(String palindrome) {
		char[] palindromeChar = palindrome.toCharArray();
		  if(palindrome.length() == 1)
			  return "";
		  
		  for(int i=0;i<palindromeChar.length/2;i++) {
			  if(palindromeChar[i]!= 'a') {
				  palindromeChar[i] = 'a';
				  return String.valueOf(palindromeChar);
			  }	
		  }
		  
		  palindromeChar[palindromeChar.length-1] = 'b';
		  return String.valueOf(palindromeChar);
	  }
}