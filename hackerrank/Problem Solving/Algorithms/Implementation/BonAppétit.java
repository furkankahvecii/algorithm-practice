/*
* https://www.hackerrank.com/challenges/bon-appetit/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BonAppétit
{
	static void bonAppetit(List<Integer> bill, int k, int b)
	{
		int toplam=0;
        for(int i=0;i<n;i++)
        {
            if(i==k) continue;
            else
            {
                toplam+=ar[i];
            }
        }

        toplam=toplam/2;

        if(toplam!=b)
        {
            System.out.println(Math.abs(toplam-b));
        }
        else
        {
            System.out.println("Bon Appetit");
        }
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}