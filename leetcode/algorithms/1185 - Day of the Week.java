/*
 * https://leetcode.com/problems/day-of-the-week/
 */

import java.time.*;

class Solution 
{
    public String dayOfTheWeek(int day, int month, int year) 
    {
        LocalDate birthday = LocalDate.of(year, month, day);
		StringBuilder dayOfWeek = new StringBuilder(birthday.getDayOfWeek().toString());
		
		for(int i = 1 ; i<dayOfWeek.length();i++)
		{
			dayOfWeek.setCharAt(i, Character.toLowerCase(dayOfWeek.charAt(i)));
		}
		
		return dayOfWeek.toString();
    }
}