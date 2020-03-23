/*
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
*/


import java.io.*;
import java.util.*;

public class JavaEndOfFile 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
	    int sayac=1;
	    while(scan.hasNext()==true)
	    {
	        System.out.println(sayac + " " + scan.nextLine());
	        sayac++;
	        if(scan.hasNext()==false)
	            System.out.println(++sayac + " " + scan.nextLine());
	    }
    }
}