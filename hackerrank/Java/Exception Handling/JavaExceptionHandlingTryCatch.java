/*
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandlingTryCatch
{
    public static void main(String[] args) throws Exception
    {
		Scanner scan=new Scanner(System.in);
		int number,number2;
		try 
		{
			number = scan.nextInt();
			number2 = scan.nextInt();
			System.out.println(number / number2);
		}
        
		catch (InputMismatchException e)
		{
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e)
		{
    	    System.out.println(e);
		}
    }
}