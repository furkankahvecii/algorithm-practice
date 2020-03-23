/*
 * https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
 */



class Solution 
{
    public static int[] numSmallerByFrequency(String[] queries, String[] words) 
    {
        int[] returnArray = new int[queries.length];
        int[] wordsInteger = new int[words.length];
        int count = 0;

		for(int i=0;i<words.length;i++)
		{
			wordsInteger[i] = getCount(words[i]);
		}
		
		for(int i=0;i<queries.length;i++)
		{
			int number = getCount(queries[i]);
			for(int a : wordsInteger)
			{
				if(number < a)
					count++;
			}
			
			returnArray[i] = count;
			count=0;
		}
		
		return returnArray;
    }
    
    public static int getCount(String word)
	{
		int min = Integer.MAX_VALUE;
		int count = 0;
		for(char c : word.toCharArray())
		{
			int fark = c - 'a';
			
			if(min == fark)
				count++;

			if(min > c-'a')
			{
				count = 1;
				min = c-'a';
			}
		}

		return count;
	}
}