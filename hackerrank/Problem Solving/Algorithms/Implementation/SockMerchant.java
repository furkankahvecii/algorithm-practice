/*
* https://www.hackerrank.com/challenges/sock-merchant/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant 
{
	static int sockMerchant(int n, int[] ar) 
    {
        ArrayList<Integer> array=new ArrayList();
	    int sayac=0,toplam=0;
		for(int i=0;i<ar.length;i++)
		{
			int index=array.indexOf(ar[i]);
			if(index==-1)
			{
				for(int j=0;j<ar.length;j++)
				 {
					 if(ar[i]==ar[j])
					 {
						 sayac++;
					 }
				 }
			}
			else
			{
				continue;
			}
			if(sayac>1)
			{ 
				array.add(ar[i]);
				toplam+=sayac/2;
				sayac=0;
			}
			else
			{
			    sayac=0;
			}
		 }

		 return toplam;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}