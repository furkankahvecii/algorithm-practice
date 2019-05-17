/*
* https://leetcode.com/problems/complement-of-base-10-integer/
*/



class Solution {
	public int bitwiseComplement(int N) 
	{
		StringBuilder str = new StringBuilder(Integer.toBinaryString(N));
		for(int i=0;i<str.length();i++)
		{
			str.setCharAt(i, str.charAt(i) == '0' ? '1' : '0');
		}
		return Integer.parseInt(str.toString(),2);
    }
}