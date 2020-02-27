/*
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
*/



class Solution {
	public int[] getNoZeroIntegers(int n) {
		int temp = n;
		while(true) {
			if(!String.valueOf(--temp).contains("0") && !String.valueOf(n-temp).contains("0")) {
				return new int[] {n-temp,temp};
			}
		}
	}
}