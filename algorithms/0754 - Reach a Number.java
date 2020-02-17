/*
 * https://leetcode.com/problems/reach-a-number/
*/



class Solution {
	// https://leetcode.com/problems/reach-a-number/discuss/381044/Java-Solution
    public int reachNumber(int target) {
		target = Math.abs(target);
		int count = 0, sum = 0;
		
		while(sum < target || (sum-target) % 2 == 1) {
			sum += count;
			count++;
		}
		
		return count-1;
   }
}
