/*
* https://leetcode.com/problems/word-pattern/
*/



import java.util.*;

class Solution 
{
    public boolean wordPattern(String pattern, String str) {
        Map<String,Character> myMap = new HashMap<String,Character>();
		String[] all = str.split(" ");
        if(pattern.length()!=all.length) return false;
		
		for(int i = 0 ; i<pattern.length();i++)
		{
			if(!myMap.containsKey(all[i]))
			{
				if(myMap.containsValue(pattern.charAt(i))) return false;
				myMap.put(all[i],pattern.charAt(i));
			}
			else
			{
				if(pattern.charAt(i) != (myMap.get(all[i])))
					return false;
			}
		}

		return true;
    }
}