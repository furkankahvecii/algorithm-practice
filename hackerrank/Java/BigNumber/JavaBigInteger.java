/*
 * https://www.hackerrank.com/challenges/java-biginteger/problem
*/


import java.io.*;
import java.util.*;
import java.math.*;

public class JavaBigInteger
{
   public static void main(String[] args)
   {
      Scanner scan=new Scanner(System.in);

		BigInteger sayi=new BigInteger("1");
		BigInteger sayi2=new BigInteger("1");

		sayi=scan.nextBigInteger();
		sayi2=scan.nextBigInteger();

		System.out.println(sayi.add(sayi2));
		System.out.println(sayi.multiply(sayi2));
   }
}