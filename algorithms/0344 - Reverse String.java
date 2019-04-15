/*
* https://leetcode.com/problems/reverse-string/
*/



class Solution {
    public void reverseString(char[] s) {
        char q=' ';
        for(int i = 0 ; i<s.length/2;i++)
        {
        	q=s[i];
        	s[i] = s[s.length-i-1];
        	s[s.length-i-1] = q;
        }
    }
}