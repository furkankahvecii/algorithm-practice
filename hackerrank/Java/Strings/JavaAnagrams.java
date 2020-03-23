/*
 * https://www.hackerrank.com/challenges/java-anagrams/problem
*/


import java.util.Scanner;
import java.util.regex.*;

public class JavaAnagrams
{
   static boolean isAnagram(String a, String b)
   {
      char[] word1 = a.toCharArray();
		char[] word2 = b.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		System.out.println(Arrays.toString(word1));
		System.out.println(Arrays.toString(word2));
	
		return Arrays.equals(word1,word2);
   }
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      String b = scan.next();
      scan.close();

      boolean ret = isAnagram(a, b);
      System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   }
}