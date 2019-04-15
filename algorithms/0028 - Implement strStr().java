/*
* https://leetcode.com/problems/implement-strstr/
*/

/*
* This may help for all case -> https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(int)
* Description for this case "something".indexOf("") -> "" + "something" = "something" so basically  "something" is ""+"something"
*/



class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}