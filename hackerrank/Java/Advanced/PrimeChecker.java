/*
 * https://www.hackerrank.com/challenges/prime-checker
*/


import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime
{
    void checkPrime(Integer... array)
    {
    	boolean flag = true;
    	for(int number : array)
    	{
    		if(number < 2 )
    			continue;
    		if(number == 2)
    		{
    			System.out.print(number +" ");
    			continue;
    		}
    		
    		for(int i = 2 ; i <= number/2; i++)
    		{
    			if(number % i == 0)
    				flag = false;
    		}
    		if(flag)
    			System.out.print(number + " ");
    		
    		flag = true;
    	}
    	
    	System.out.println();
    }
}

public class PrimeChecker 
{
	public static void main(String[] args) 
    {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());		
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}