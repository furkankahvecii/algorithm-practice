/*
 * https://leetcode.com/problems/detect-capital/
 */



class Solution 
{ 
    public boolean detectCapitalUse(String word) 
    {
     for(int i=0;i<word.length()-1;i++)
		{
			if(Character.isLowerCase(word.charAt(i)) != Character.isLowerCase(word.charAt(i+1)))
			{
				if(Character.isUpperCase(word.charAt(i)) != Character.isUpperCase(word.charAt(i+1)))
				{
					if(i==0)
					{
						if(!Character.isUpperCase(word.charAt(0)) && !Character.isLowerCase(word.charAt(1)))
							return false;
					}
					else
						return false;
				}
			}
		}
		
		return true;		
    }
}