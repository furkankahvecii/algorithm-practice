/*
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
*/


import java.util.Scanner;

public class JavaOutputFormatting 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1[]=new String[3];
        int x[]=new int[3];
        for(int i=0;i<3;i++)
        {
        	s1[i]=sc.next();
        	x[i]=sc.nextInt();
        }

        System.out.println("================================");

        for(int i=0;i<3;i++)
        {
        	System.out.print(s1[i]);
        	 for(int j=0;j<15-s1[i].length();j++)
        		 System.out.print(" ");

        	 if(x[i]>99) 
                System.out.print(x[i]);
        	 else if(x[i]>9 && x[i]<100) 
                System.out.print("0"+x[i]);
        	 else 
                System.out.print("00"+x[i]);
        	 
        	 System.out.println();
        }
       
        System.out.println("================================");
    }
}