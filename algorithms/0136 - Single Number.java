/*
* https://leetcode.com/problems/single-number/
*/

/*
* Description of the ^(bitwise) operator used in the problem -> https://leetcode.com/problems/single-number/discuss/43201/Easy-Java-solution-(tell-you-why-using-bitwise-XOR)
*/



class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++)
		 {
			 nums[0] ^= nums[i];
		 }	 	        
	     return nums[0];
    }
}