/*
* https://www.hackerrank.com/challenges/the-time-in-words/problem 
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TheTimeinWords 
{
    static String timeInWords(int h, int m) 
    {
    	Map<Integer,String> myMap = new HashMap<Integer,String>();
		myMap.put(1, "one");myMap.put(2, "two");myMap.put(3, "three");myMap.put(4, "four");myMap.put(5, "five");myMap.put(6, "six");
		myMap.put(7, "seven");myMap.put(8, "eight");myMap.put(9, "nine");myMap.put(10, "ten");myMap.put(11, "eleven");myMap.put(12, "twelve");
		myMap.put(13, "thirteen");myMap.put(14, "fourteen");myMap.put(15, "quarter");myMap.put(16, "sixteen");myMap.put(17, "seventeen");myMap.put(18, "eighteen");
		myMap.put(19, "nineteen");myMap.put(20, "twenty");myMap.put(30, "half");
		
		if(m==0) return myMap.get(h) + " o' clock";
		else if(m>=1 && m<=30)
		{
			if(m==30 || m==15) return myMap.get(m) + " past " + myMap.get(h);
			else if(m<=20)
			{
				return myMap.get(m) + " minute past " + myMap.get(h);
			}
			else
			{
				return myMap.get(20) +" " + myMap.get(m-20) +" minutes past " + myMap.get(h);
			}
		}
		else
		{
			if(60-m == 15) return myMap.get(15) + " to " + myMap.get(h+1); 
			else if(60-m<=20)
			{
				return myMap.get(60-m) + " minutes to " + myMap.get(h+1);
			}
			else
			{
				return myMap.get(20) +" " + myMap.get(60-m-20) +" minutes to " + myMap.get(h+1);
			}
		}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}