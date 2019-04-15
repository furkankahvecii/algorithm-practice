/*
* https://leetcode.com/problems/plus-one/
*/



class Solution {
    public int[] plusOne(int[] digits) {
        int[] newdigits = new int[digits.length+1];
		boolean decision = false;
		int j=0;
		for(int i = digits.length -1 ; i>=0 ; i--)
		{
			if(decision == false)
			{
				if(digits[i] == 9) digits[i] =0;
				else digits[i]++;
			}
			if(digits[i] != 0) decision = true;
		}	
		if(digits[0] == 0 )
		{
			
			newdigits[j+1] = digits[j];
			j++;
			newdigits[0] = 1;
		}
		else
		{
			return digits;
		}
		
		return newdigits;
    }
}