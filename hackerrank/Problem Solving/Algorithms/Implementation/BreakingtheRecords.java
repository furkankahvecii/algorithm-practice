/*
* https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BreakingtheRecords 
{
	static int[] breakingRecords(int[] scores) 
	{
		int [] highest=new int[scores.length];
		int [] lowest=new int[scores.length];
		int temp=scores[0];
		int temp2=scores[0];
		highest[0]=lowest[0]=scores[0];
		int sayac=0;
		
		for(int i=1;i<scores.length;i++)
		{
			if(true)
			{
				if(temp<scores[i])
					lowest[i]=temp;
				else
				{
					lowest[i]=scores[i];
					temp=scores[i];
				}
			}
			
			if(true)
			{
				if(temp2>scores[i])
					highest[i]=temp2;
				else
				{
					highest[i]=scores[i];
					temp2=scores[i];
				}
			}
		}
		
		int toplamRekor[]=new int[2];
		int sayi=lowest[0],sayi2=lowest[0];
		for(int i=0;i<scores.length;i++)
		{
			if(scores[i] ==highest[i] && scores[i]!=lowest[i]&& sayi !=scores[i] )
			{
				toplamRekor[0]++;
				sayi=scores[i];
			}
			if(scores[i] == lowest[i] && scores[i] !=highest[i] && sayi2 !=scores[i])
			{
				toplamRekor[1]++;
				sayi2=scores[i];
			}
		}
		
		return toplamRekor;
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
	}
}