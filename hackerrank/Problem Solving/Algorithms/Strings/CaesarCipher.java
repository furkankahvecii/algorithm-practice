/*
* https://www.hackerrank.com/challenges/caesar-cipher-1/problem 
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher 
{
	static String caesarCipher(String s, int k) 
	{
      StringBuilder cipherText  = new StringBuilder();
      char q=' ';
      int j=0;
      for(int i = 0;i<s.length() ; i++)
      {
          q= s.charAt(i);
          if(!Character.isLetter(q))
          {
              j=k;
          }
          while(j<k)
          {
              if(q=='z') {
                  q='a';
                  q--;
              }
              if(q=='Z') {
                  q='A';
                  q--;
              }    
              q++;
              j++;
          }
          cipherText.append(q);
          j=0;
      }
      return cipherText.toString();
	}
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
