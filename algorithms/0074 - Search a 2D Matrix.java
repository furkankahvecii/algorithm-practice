/*
* https://leetcode.com/problems/fizz-buzz/
*/



class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) {
          int r = matrix.length;
          if(r==0) return false;
	      int c = matrix[0].length;
	      int max = r*c-1;
	      int min = 0;

	      while(min<=max)
	      {
	    	  int targetIndex = (max+min) /2;
	    	  if(matrix[targetIndex/c][targetIndex%c] ==target)
	    		  return true;
	    	  else if(matrix[targetIndex/c][targetIndex%c] < target)
	    		  min = targetIndex+1;
	    	  else
	    		  max=targetIndex-1;
	      }
	      return false;
    }
}
