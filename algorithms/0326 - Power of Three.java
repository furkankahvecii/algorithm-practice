/*
* https://leetcode.com/problems/power-of-three/
*/



class Solution {
    public boolean isPowerOfThree(int num) {
      if(num==1) return true;
		if(num%3!=0 || num<=0) return false;	
        while(num!=1)
        {
        	if((num%3)%3!=0) return false;
        	num/=3;
        }  
        return true;
    }
}