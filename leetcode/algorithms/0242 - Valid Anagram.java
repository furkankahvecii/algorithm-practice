/*
* https://leetcode.com/problems/valid-anagram/
*/



import java.util.*;

class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
    	 Integer[] arr1 = new Integer[26];
		 Integer[] arr2 = new Integer[26];
		 
		 Arrays.fill(arr1, 0);
		 Arrays.fill(arr2, 0);
	    
	     if(s.length() != t.length())
	    	 return false;
	     else
	     {
	    	 for(int i=0; i<s.length(); i++)
	         {
	    		 arr1[s.charAt(i) - 'a']++;
		         arr2[t.charAt(i) - 'a']++;
	         }
	     }
   
	     return Arrays.equals(arr1,arr2); 
    }
}