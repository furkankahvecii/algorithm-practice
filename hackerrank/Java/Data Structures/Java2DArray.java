/*
 * https://www.hackerrank.com/challenges/java-2d-array
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java2DArray
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	    int arr[][] = new int[6][6];
	    ArrayList dizi=new ArrayList();
	    int sayac=0;	        
	    for(int i=0; i < 6; i++)
		{
	        for(int j=0; j < 6; j++)
			{
	            arr[i][j] = in.nextInt();
	        }
	    }
	            
	    for(int k=0;k<4;k++)
	    {
	        for(int j=0;j<4;j++)
	        {
	        	int toplam=arr[k][j]+arr[k][j+1]+arr[k][j+2] +   arr[k+1][j+1] + arr[k+2][j]+arr[k+2][j+1]+arr[k+2][j+2];
	        	dizi.add(toplam);
	        }
	    }

	    Collections.sort(dizi);
	    System.out.println(dizi.get(15));
	}
}