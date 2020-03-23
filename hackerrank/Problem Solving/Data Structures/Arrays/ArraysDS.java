/*
 * https://www.hackerrank.com/challenges/arrays-ds/problem
*/



import java.util.*;

public class ArraysDS 
{
	static int[] reverseArray(int[] a) {
		for(int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] =  a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        
        return a;
	}
}