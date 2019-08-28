/*
* https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
*/



class Solution 
{
    public int countCharacters(String[] words, String chars) 
    {
        int sumCount = 0;
        boolean flag = true;
        int[] characterArrays = new int[26];
        
        for(Character character : chars.toCharArray())
            characterArrays[character-'a']++;

        for(String word : words)
        {
        	if(word.length() > chars.length())
        		continue;
        	
            int[] tempArray = characterArrays.clone();

            for(Character character : word.toCharArray())
            {
            	if(tempArray[character-'a']==0)
            	{
            		flag = false;
            		break;
            	}
            	else
            		tempArray[character-'a']--;
            }
            
            if(flag)
            	sumCount += word.length();
            else
            	flag = true;
        }
        return sumCount;
    }
}