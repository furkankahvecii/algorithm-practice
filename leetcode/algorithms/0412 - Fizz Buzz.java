/*
* https://leetcode.com/problems/fizz-buzz/
*/



import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) 
    {
    	int count=1;
	    List<String> myList  = new ArrayList<String>();    
	    while(count<=n)
	    {
	    	if(count % 3 ==0 && count % 5 ==0) myList.add("FizzBuzz");
	        else if(count % 5 == 0) myList.add("Buzz");
	        else if(count % 3 == 0) myList.add("Fizz");
	        else myList.add(String.valueOf(count));
	    	count++;
	    }
	    return myList;
    }
}