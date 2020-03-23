/*
 * https://leetcode.com/problems/find-common-characters/
 */


import java.util.*;

class Solution 
{
    public List<String> commonChars(String[] A) 
    {
        List<String> common = new ArrayList<String>();
		int[] min = new int[26];
		
		Arrays.fill(min, Integer.MAX_VALUE);
		
		
		for(String word : A)
		{
			int[] characterList = new int[26];
			
			for(int i=0;i<word.length();i++)
			{
				characterList[word.charAt(i)-'a']++;
			}
			
			
			for(int i=0;i<26;i++)
			{
				min[i] = Math.min(min[i], characterList[i]);
			}
		}
		
		
		
		for(int i =0 ;i < 26;i++)
		{
			while(min[i]>0)
			{
				common.add(""+(char)(i+'a'));
				min[i]--;
			}
		}
		
		return common;
    }
}