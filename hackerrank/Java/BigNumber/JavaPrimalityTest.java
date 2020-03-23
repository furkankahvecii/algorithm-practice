/*
 * https://www.hackerrank.com/challenges/java-primality-test/problem
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaPrimalityTest
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
	   BigInteger n = in.nextBigInteger();
	   in.close();
	   if(n.isProbablePrime(1))
	    	System.out.println("prime");
	   else
	    	System.out.println("not prime");      
   }
}