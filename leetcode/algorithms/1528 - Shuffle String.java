/*
 * https://leetcode.com/problems/shuffle-string/
 */



class Solution {
    public String restoreString(String s, int[] indices) 
    {
        StringBuilder str = new StringBuilder("");
		str.setLength(s.length());
		
		for(int i=0;i<str.length();i++)
		{
			str.setCharAt(indices[i], s.charAt(i));
		}
        
		return str.toString();  
    }
}
