/*
* https://leetcode.com/problems/roman-to-integer/
*/



import java.util.*;

class Solution {
    public int romanToInt(String s) {
		Map<Character,Integer> romen=new HashMap<Character,Integer>();
		romen.put('I', 1);
		romen.put('V', 5);
		romen.put('X', 10);
		romen.put('L', 50);
		romen.put('C', 100);
		romen.put('D', 500);
		romen.put('M', 1000);
		int toplam=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.length()!=(i+1) && romen.get(s.charAt(i)) < romen.get(s.charAt(i+1)))
			{
				toplam += (romen.get(s.charAt(i+1)) -  romen.get(s.charAt(i)));
				i++;
			}
			else {
				toplam+=romen.get(s.charAt(i));
			}			
		}
		return toplam;     
    }
}
