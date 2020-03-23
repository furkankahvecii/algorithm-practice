/* 
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem 
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorials 
{
    static void extraLongFactorials(int n) 
    {
    	BigInteger sum = new BigInteger("1");
    	
    	for(int i=1;i<=n;i++)
        {
            sum=sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
