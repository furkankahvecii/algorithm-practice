/*
 * https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
*/



class Solution {
	public int numPairsDivisibleBy60(int[] times) {
		int count = 0;
		Map<Integer, Integer> partners = new HashMap<>();

		for(int time : times) {
			int t = time % 60;
			
			if(t == 0) {
				count += partners.getOrDefault(t, 0);
			}
			else {
				count += partners.getOrDefault(60-t, 0);
			}
			
			partners.put(t, partners.getOrDefault(t, 0)+1);
		}
		
		return count;
   }
}
