/*
* https://leetcode.com/problems/palindrome-number/
*/


import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
    	int gecici=x;
    	if(x<0) return false;
    	       
    	ArrayList<Integer> dizi = new ArrayList<Integer>();
    	while(gecici>0)
    	{
    	 	dizi.add(gecici%10);
    	   gecici=gecici/10;
    	 }
    	 int min=0 , max=dizi.size()-1;
    	 while(x!=0 && min!=max &&  max>min)
    	 { 	  
    	     if(dizi.get(min) != dizi.get(max))
    	     {    
    	        return false;
    	     }
    	        min++;
    	        max--;
    	  }   
    	  return true;
    }
}