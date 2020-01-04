/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */


public class Solution {
	
	static int countDigit(long n) {
		return (int) Math.floor(Math.log10(n) +1);
	}

	static public int findNumbers(int[] nums) {
		int count = 0;
		for(int number : nums) {
			if(countDigit(number) % 2 ==0)
				count++;
		}
		
		return count;
	}
}

