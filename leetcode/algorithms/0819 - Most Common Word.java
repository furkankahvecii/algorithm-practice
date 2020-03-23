
/*
 * https://leetcode.com/problems/most-common-word/
 */

import java.util.*;

class Solution 
{
	public String mostCommonWord(String paragraph, String[] banned) 
	{
		String[] split = paragraph.toLowerCase().split("\\W+");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String a : split)
			map.put(a, map.getOrDefault(a, 0) + 1);
		for (String b : banned)
			map.remove(b);

		int max = Integer.MIN_VALUE;
		String word = "";
		for (Map.Entry s : map.entrySet()) {
			if ((int) s.getValue() > max) {
				max = (int) s.getValue();
				word = (String) s.getKey();
			}
		}

		return word;
	}
}