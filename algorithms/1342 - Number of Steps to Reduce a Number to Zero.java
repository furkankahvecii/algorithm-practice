/*
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
*/



class Solution {
    public int numberOfSteps (int num) {
        int count=0;
    	for(;;) {
    		if(num%2==0) 
    			num/=2;
    		else 
    			num-=1;
    		count++;
    		if(num==0)
    			return count;
    	}
    }
}