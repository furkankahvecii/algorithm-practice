/*
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
*/



class Solution {
	public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2) {
        	for(int j=0;j<nums[i];j++)
        		al.add(nums[i+1]);
        }
		
        int[] n = new int[al.size()];
        Arrays.setAll(n, al::get);
        
        return n;
    }
}