/*
* https://leetcode.com/problems/power-of-four/
*/



class Solution {
    public boolean isPowerOfFour(int num) {
       if(num==1) return true;
		if(num%4!=0) return false;	
        while(num!=1)
        {
        	if(num%4!=0) return false;	
        	if(num<1) return false;
        	num/=4;
        }  
        return true;
    }
}