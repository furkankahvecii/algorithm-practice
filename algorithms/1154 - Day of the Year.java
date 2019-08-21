/*
 * https://leetcode.com/problems/day-of-the-year/
*/


import java.time.LocalDate;

class Solution 
{
    public int dayOfYear(String date) 
    {
        String[] array = date.split("-");
        
        int y = Integer.valueOf(array[0]);
        int m = Integer.valueOf(array[1]);
        int d = Integer.valueOf(array[2]);
        
        LocalDate dt = LocalDate.of(y,m,d);
        
		return dt.getDayOfYear();
    }
}