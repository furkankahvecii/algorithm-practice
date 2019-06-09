/*
* https://leetcode.com/problems/peak-index-in-a-mountain-array/
*/



class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int i=1;i<A.length;i++)
        {
            if(A[i] < A[i-1])
            {
                return  i-1;
            }
        }
        return A.length-1;
    }
}