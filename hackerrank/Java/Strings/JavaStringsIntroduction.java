/*
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
*/


import java.io.*;
import java.util.*;

public class JavaStringsIntroduction
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String A = sc.next();
      String B = sc.next();
      System.out.println(A.length()+B.length());
      String C[]= {A,B};
      Arrays.sort(C);

      if(C[0]==A) 
         System.out.println("No");
      else
    	   System.out.println("Yes");

      System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+ " "+ B.substring(0, 1).toUpperCase()+B.substring(1));
   }
}