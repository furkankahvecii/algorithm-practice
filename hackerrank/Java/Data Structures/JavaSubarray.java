/*
 * https://www.hackerrank.com/challenges/java-negative-subarray
*/


import java.io.*;
import java.util.*;

public class JavaSubarray
{

	private static int negativeSubarrays(int [] array) 
	{
	    int count = 0;
	    int sum   = 0;
	    for (int i = 0; i < array.length; i++) {
	        for (int j = i; j < array.length; j++) {
	            sum += array[j];
	            if (sum < 0) {
	           
	                count++;
	            }
	        }
	        sum = 0;
	    }
	    return count;
	}

   public static void main(String[] args)
   {
	    Scanner scan=new Scanner(System.in);
		
		int sum=scan.nextInt();
		
		int dizi[] =new int[sum];
		
		for(int i=0;i<sum;i++)
			dizi[i]=scan.nextInt();
		
		System.out.println(negativeSubarrays(dizi));
   }
}