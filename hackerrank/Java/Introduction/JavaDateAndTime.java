/*
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
*/


public class JavaDateAndTime 
{
     public static String getDay(String day, String month, String year) 
     {
		 int mm = Integer.valueOf(month);
		 int dd = Integer.valueOf(day);
		 int yy = Integer.valueOf(year);
		
		 LocalDate dt = LocalDate.of(yy, mm, dd);
		 return String.valueOf(dt.getDayOfWeek());
    }
}