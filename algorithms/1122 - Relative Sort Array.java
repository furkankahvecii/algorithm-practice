/*
 * https://leetcode.com/problems/relative-sort-array/
 */

import java.util.*;

class Solution 
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        if (arr2 == null || arr2.length == 0) 
		{
			Arrays.sort(arr1);
			return arr1;
		}
		
		int countMatching = 0;
		
		for(int i = 0 ; i < arr2.length; i++)
		{
			for (int j = countMatching; j < arr1.length; j++) 
			{
				if (arr1[j] == arr2[i]) 
				{
					int temp2 = arr1[j];
					arr1[j] = arr1[countMatching];
					arr1[countMatching] = temp2;
                    
                    countMatching++;
				}
			}
		}
		
		int[] plus = new int[arr1.length - countMatching];
		int count2 = 0;
		
		for (int i = countMatching; i < arr1.length; i++) 
		{
			plus[count2++] = arr1[i];
		}
		
		Arrays.sort(plus);
		count2 = 0;
		for (int i = countMatching; i < arr1.length; i++)
			arr1[i] = plus[count2++];

		return arr1;
    }
}