/*
 * https://leetcode.com/problems/maximum-product-of-word-lengths/
 */


class Solution 
{
	public int maxProduct(String[] words) 
	{
		int max = Integer.MIN_VALUE;
		boolean bool = true;
		for (int i = 0; i < words.length - 1; i++) 
		{
			for (int j = i; j < words.length; j++) 
			{
				if (words[i].length() * words[j].length() > max) 
				{
					for (char c : words[i].toCharArray()) 
					{
						if (words[j].indexOf(c) != -1) 
						{
							bool = false;
							break;
						}
					}
					if (bool)
						max = words[i].length() * words[j].length();

					bool = true;
				}
			}
		}

		return max == Integer.MIN_VALUE ? 0 : max;
	}
}