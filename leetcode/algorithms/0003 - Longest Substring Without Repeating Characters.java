/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

import java.util.*;

class Solution 
{
	// Thank you prashant404
	// https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/339051/Java-or-Short-Easy-Clean-or-with-explanation-or-HashMap-and-Two-Pointers
	public static int lengthOfLongestSubstring(String s) 
	{
		if (s.length() < 2)
			return s.length();
		Map<Character, Integer> map = new HashMap<>();
		int left = 0;
		int maxLength = 0;
		int right;
		for (right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			if (map.containsKey(ch)) {
				maxLength = Math.max(maxLength, right - left);
				left = Math.max(left, map.get(ch) + 1);
			}
			map.put(ch, right);
		}
		return Math.max(right - left, maxLength);
	}
}