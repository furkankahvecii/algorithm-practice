/*
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
*/


import java.io.*;
import java.util.*;

public class JavaStringReverse
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String A=sc.next();
      String B="";
      for(int i=A.length()-1;i>-1;i--)
      {
         B+=A.charAt(i);
      }
      if(A.equals(B)==true) 
         System.out.println("Yes");
      else
         System.out.println("No");
   }
}