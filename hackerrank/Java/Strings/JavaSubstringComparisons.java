/*
 * https://www.hackerrank.com/challenges/java-string-compare/problem
*/


import java.util.Scanner;
import java.util.regex.*;

public class JavaSubstringComparisons
{
   public static String getSmallestAndLargest(String s, int k) 
   {
      String smallest = "";
		String largest = "";
	   ArrayList dizi=new ArrayList();
		int sayac=0;
		for(int i=0;i<s.length();i++)
		{    	
		   for(int j=k+i;j<=s.length();j=j+k)
		      dizi.add(s.substring(j-k, j));
		}

		Collections.sort(dizi);
		smallest = (String) dizi.get(0);
	   largest =  (String) dizi.get(dizi.size()-1);

		return smallest + "\n" + largest;
   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String s = scan.next();
      int k = scan.nextInt();
      scan.close();
      
      System.out.println(getSmallestAndLargest(s, k));
   }
}