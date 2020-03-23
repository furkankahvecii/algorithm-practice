/*
 * https://www.hackerrank.com/challenges/java-arraylist
*/


import java.io.*;
import java.util.*;


public class JavaArraylist
{
   public static void main(String[] args)
   {
	    Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		ArrayList dizi[]=new ArrayList[sayi];
		ArrayList dizi2=new ArrayList();
	
		for(int i=0;i<sayi;i++)
		{
			int d=scan.nextInt();
			dizi[i] = new ArrayList();
			for(int j=0;j<d;j++)
			{
				dizi[i].add(scan.nextInt());
			}
		}
		
		int sayi2=scan.nextInt();

		for(int i=0;i<sayi2;i++)
		{
			int aa=scan.nextInt();
			int aa2=scan.nextInt();
			try
			{
				int naber=(int)dizi[aa-1].get(aa2-1);
				dizi2.add(naber);
			}
			catch(Exception e)
			{
				dizi2.add("ERROR!");
			}
			
		}
		
		for (Object object : dizi2) {
			System.out.println(object);
		}
   }
}