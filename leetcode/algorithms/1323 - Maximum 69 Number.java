/*
 * https://leetcode.com/problems/maximum-69-number/
*/



class Solution {
	public int maximum69Number (int num) {
        StringBuilder numString = new StringBuilder(String.valueOf(num));
		
		for(int i=0;i<numString.length();i++)
		{
			if(numString.charAt(i) == '6') {
				numString.setCharAt(i, '9');
				return Integer.valueOf(numString.toString());
			}
		}
		
		return num;
    }
}