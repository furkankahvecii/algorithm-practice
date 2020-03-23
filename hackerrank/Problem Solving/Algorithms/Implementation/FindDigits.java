/*
 * https://www.hackerrank.com/challenges/find-digits/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FindDigits 
{
	static int findDigits(int n)
	{
		int count=0;
		int temp=n;
		while(n>0)
		{	
			try 
			{
				if(temp % (n %10) == 0)
				{
					count++;
				}
			}
			catch(ArithmeticException  e)
			{
				//ZeroDivisionError
			}
					
			n=n/10;
		}
		return count;
	}


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
