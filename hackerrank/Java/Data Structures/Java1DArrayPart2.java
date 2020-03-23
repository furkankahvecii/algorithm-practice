/*
 * https://www.hackerrank.com/challenges/java-1d-array-introduction
*/


import java.util.*;


public class Java1DArray
{
   public static void main(String[] args)
   {
	 	Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        int a[]=new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i]=val;
        }
		
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
   }
}