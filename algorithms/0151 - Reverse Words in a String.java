/*
* https://leetcode.com/problems/reverse-words-in-a-string/
*/



class Solution {
    public String reverseWords(String s) {
		String all[] = s.split(" ");
	    StringBuilder sum = new StringBuilder();
		for(int i=all.length-1 ; i>=0 ; i--)
		{
			if(!all[i].equals(""))
			{
				sum.append(all[i] + " ");
			}				
		}
		return sum.toString().trim();
    }
}