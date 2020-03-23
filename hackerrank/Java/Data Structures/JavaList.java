/*
 * https://www.hackerrank.com/challenges/java-list/problem
*/


import java.io.*;
import java.util.*;

public class JavaList
{
   public static void main(String[] args)
   {
	    Scanner scan=new Scanner(System.in);
		int elemanToplam=scan.nextInt();
		ArrayList dizi=new ArrayList();
		for(int i=0;i<elemanToplam;i++)
		{
			dizi.add(scan.nextInt());
		}
		
		int toplamİslem=scan.nextInt();
		
		for(int i=0;i<toplamİslem;i++)
		{
			String kelime=scan.next();
			if(kelime.equals("Insert"))
			{	
				dizi.add(scan.nextInt(),scan.nextInt());
			}
			else
			{
				dizi.remove(scan.nextInt());
			}
		}
        for (Object object : dizi) {
			System.out.print(object+" ");
		}
   }
}