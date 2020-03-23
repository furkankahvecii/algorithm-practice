/*
* https://leetcode.com/problems/jewels-and-stones/
*/



import java.util.*;

class Solution 
{
    public int numJewelsInStones(String J, String S) {
        int sum=0;
        for(int i=0;i<J.length();i++)
        {
        	char character = J.charAt(i);
        	sum += S.chars().filter(ch -> ch == character).count();
        }
        return sum;
    }
}