/*
* https://www.hackerrank.com/challenges/the-birthday-bar/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BirthdayChocolate
{
	static int birthday(List<Integer> s, int d, int m) 
	{
		int toplam=0,sayac=0;
        int q=s.size()-1;
        if(s.size()==1) q=s.size();
        for(int i=0;i<q;i++)
        {
        	for(int j=i;j<=i+m-1;j++) 
	        {
        		if(i+m-1>q) 
        			break;
	            toplam+=s.get(j);
            }
        	
        	if(toplam==d) 
        		sayac++;
        	
        	toplam=0;
        }
        
        return sayac;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}