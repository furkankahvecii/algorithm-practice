/*
 * https://www.hackerrank.com/challenges/phone-book/problem
*/


import java.util.*;
import java.io.*;

public class JavaMap
{
   public static void main(String[] args)
   {
	    Scanner in = new Scanner(System.in);
	    Map<String,Integer> book = new HashMap<String,Integer>();
	    int n=in.nextInt();
    	in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            if(!book.containsKey(name))
            {
                book.put(name, phone);
            }
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(book.containsKey(s))
                System.out.println(s+"="+book.get(s));
            else
                System.out.println("Not found");
        }
   }
}