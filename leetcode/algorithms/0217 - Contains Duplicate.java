/*
* https://leetcode.com/problems/contains-duplicate/
*/



import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> list = new HashSet<Integer>();
        
        for(int number : nums)
        {
        	if(!list.add(number)) return true;
        }
        return false;
    }
}