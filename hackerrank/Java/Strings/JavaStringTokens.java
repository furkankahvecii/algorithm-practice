/*
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
*/


import java.io.*;
import java.util.*;

public class JavaStringTokens
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String s=scan.nextLine();
      s.trim();
      StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
      int x = st.countTokens();
      System.out.println(x);
      while(st.hasMoreTokens())
      {
         System.out.println(st.nextToken());
      }
     scan.close(); 
   }
}