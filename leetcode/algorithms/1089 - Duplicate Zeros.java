/*
 * https://leetcode.com/problems/duplicate-zeros/
 */



public class Solution {
    public static void duplicateZeros(int[] arr) 
    {
        for(int i=0;i<arr.length-1;i++)
        {
        	if(arr[i] == 0)
        	{
        		for(int j=arr.length-1;j>i+1;j--)
        		{
        			arr[j] = arr[j-1];
        		}
        		arr[i+1] = 0;
        		i++;
        	}
        }   
    } 
}
