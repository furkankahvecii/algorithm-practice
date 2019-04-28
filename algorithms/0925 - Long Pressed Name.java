/*
* https://leetcode.com/problems/long-pressed-name/
*/



class Solution {
    public boolean isLongPressedName(String name, String typed) 
    {
        if(name.length()>typed.length()) return false;
		if(name.equals(typed)) return true;
		
		int index = 0;
        
        for (int i = 0 ;i<typed.length(); i++) 
        {
            if (name.charAt(index) == typed.charAt(i)) 
            {
            	index++;
            	if(index==name.length())
            		return true;
            }
        }
        
        return false;
    }
}