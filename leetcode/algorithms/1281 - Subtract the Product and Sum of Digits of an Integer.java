/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */


public class Solution {
	
	static public int subtractProductAndSum(int n) {
		int sum = 0, multly = 1;
		int digit;
		while(n>0) {
			digit = n %10;
			sum += digit;
			multly *= digit;
			n = n/10;
		}
		
		return multly - sum;
	}
}