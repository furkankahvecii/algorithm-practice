/*
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */

 // Thank you for Ramazan Girgin. (https://github.com/ramazangirgin/leetcode/blob/master/src/main/java/girgin/ramazan/leekcode/problem17/PhoneNumberLetterCombinationsGenerator.java)

import java.util.*;

class Solution {
   private static Map<Character, char[]> numberMap = new HashMap<>();
	
	private static void initMap() {
	    addToMap('2', 'a', 'b', 'c');
	    addToMap('3', 'd', 'e', 'f');
	    addToMap('4', 'g', 'h', 'i');
	    addToMap('5', 'j', 'k', 'l');
	    addToMap('6', 'm', 'n', 'o');
	    addToMap('7', 'p', 'q', 'r', 's');
	    addToMap('8', 't', 'u', 'v');
	    addToMap('9', 'w', 'x', 'y', 'z');
	}
	
	private static void addToMap(char digit, char... letters) {
	    numberMap.put(digit, letters);
	}

	public static List<String> letterCombinations(String digits)
	{
		if(digits.isEmpty() || digits == null)
		{
			return Collections.emptyList();
		}
		
		    initMap();
		List<String> resultList = new ArrayList<>();
		executeLevel(resultList,"",digits.toCharArray(),0);
		return resultList;
	}
	
	private static void executeLevel(List<String> resultList, String input , char[] chars, int index)
	{
		if(chars.length == index)
		{
			resultList.add(input);
			return;
		}
		
		char[] h = numberMap.get(chars[index]);
		
		for(Character c : h)
		{
			executeLevel(resultList,input + c ,chars,index+1);
		}
		
	}
}