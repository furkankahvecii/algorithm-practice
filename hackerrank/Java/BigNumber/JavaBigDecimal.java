/*
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem
*/


import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal
{
   public static void main(String[] args)
   {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      String []s=new String[n+2];
      for(int i=0;i<n;i++)
      {
          s[i]=sc.next();
      }
      sc.close();

      Arrays.sort(s, 0, n, (o1, o2) -> 
      {
         BigDecimal b1 = new BigDecimal(o1);
         BigDecimal b2 = new BigDecimal(o2);
         return b2.compareTo(b1);
      });

      //Output
      for(int i=0;i<n;i++)
      {
         System.out.println(s[i]);
      } 
   }
}