/*
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */


class Solution {
	 public static int[] sumZero(int n) 
	 {
		 int[] array = new int[n];
		 int count = 1;

		 if(n%2!=0)
		 {
			 array[0] = 0;
			 for(int i = 1 ; i<n;i++)
			 {
				 array[i] = count;
				 array[n-i] = -count;
				 count++;
			 }
		 }
		 else {
			 for(int i = 0 ; i<n;i++)
			 {
				 array[i] = count;
				 array[n-i-1] = -count;
				 count++;
			 }
		 }
		 		 
		return array;        
	 }
}
