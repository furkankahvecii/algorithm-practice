/*
* https://leetcode.com/problems/number-of-substrings-with-only-1s/
*/



class Solution {
    public int numSub(String s) {
        int res = 0, count = 0, mod = (int)1e9 + 7;
        for(char a : s.toCharArray())
        {
          count = a == '1' ? count + 1 : 0;
              res = (res + count) % mod;
        }

        return res;
    }
}
