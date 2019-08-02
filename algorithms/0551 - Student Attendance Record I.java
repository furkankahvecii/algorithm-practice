/*
 * https://leetcode.com/problems/student-attendance-record-i/
 */



class Solution {
    public boolean checkRecord(String s) 
    {
        char[] arr = s.toCharArray();
        int aCount=0;
        int lCount=0;
        
        for(char i : arr){

           if(i=='A') {
               aCount++;
               if(aCount==2) return false;
               lCount=0;
           }else if(i=='P'){
                lCount=0;
            }else if(i=='L') {
               lCount++;
                if(lCount==3) return false;
            }
        }
        return true;
    }
}