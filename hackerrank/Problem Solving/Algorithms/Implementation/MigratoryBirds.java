/*
* https://www.hackerrank.com/challenges/migratory-birds/problem
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

public class MigratoryBirds 
{
	static int migratoryBirds(int n, int[] ar) 
	{
		ArrayList dizi=new ArrayList();
	    int sayac=0;
	    int max=0;
	    int sayi=0;
	        
	     for(int i=0;i<n;i++)
	     {
	    	 int karar=dizi.indexOf(ar[i]);
        	 if(karar==-1)
        	 {
        		 for(int j=0;j<n;j++)
 	             {
 	                if(ar[i]==ar[j]) 
 	                	sayac++;
 	             }
        		 
        		 if(max<=sayac) 
        		 {
        			 if(ar[i]<sayi)  
        				 sayi=ar[i];
        			 
        			 sayi=ar[i];
        			 max=sayac;
        		 }   
        		 sayac=0;
        	 }
        	 else
        	 {
        		 continue;
        	 } 
        	 
             dizi.add(ar[i]); 
	     }
	     
	     return sayi;
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException 
	{
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int[] ar = new int[n];
	     for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	     }
	     int result = migratoryBirds(n, ar);
	     System.out.println(result);
     }
}