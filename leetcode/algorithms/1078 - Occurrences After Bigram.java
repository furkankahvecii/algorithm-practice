/*
 * https://leetcode.com/problems/occurrences-after-bigram/
 */


import java.util.*;

class Solution 
{
    public String[] findOcurrences(String text, String first, String second) 
    {
        String[] array = text.split(" ");
        List<String> list = new ArrayList<String>();
        int count = 0;
        
        for(int i=0;i<array.length;i++)
        {
        	if(array[i].equals(first))
        	{
        		if(i+1 <array.length && array[i+1].equals(second))
        		{
        			if(i+2 < array.length)
        			{
        				list.add(array[i+2]);
        			}
        		}	
        	}
        }
        
        String[] returnArray = new String[list.size()];
        
        for(String word : list)
        	returnArray[count++] = word;
        
        return returnArray;
    }
}