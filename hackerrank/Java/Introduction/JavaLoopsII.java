/*
 * https://www.hackerrank.com/challenges/java-loops/problem
*/


import java.util.*;
import java.io.*;

public class JavaLoopsII 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int toplam=0;
        int sayac=1;
        int t=in.nextInt();
        for(int k=0;k<t;k++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for( int i=1;i<=n;i++)
            {
                if(i==1)     
                    toplam=a+b;
                else
                {
                    sayac=sayac*2;
                    toplam+=b*sayac;
                }
                System.out.print(toplam + " ");
            }
            toplam=0;
            sayac=1;
            System.out.println();
        }
    }
}