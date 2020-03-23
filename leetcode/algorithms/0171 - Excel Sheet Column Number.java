/*
* https://leetcode.com/problems/excel-sheet-column-number/
*/



class Solution {
    public int titleToNumber(String s) {
        int sum=0;
        int alphabet_length = 26;
        int minus=0;
		for(int i=0;i<s.length();i++)
		{
            minus = s.charAt(i) - 'A';
			sum = sum *alphabet_length + minus + 1;
		}
		return sum;
    }
}