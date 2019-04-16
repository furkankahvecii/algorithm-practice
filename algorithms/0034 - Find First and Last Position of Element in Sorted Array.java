/*
* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/



class Solution {
	public int[] searchRange(int[] nums, int target) 
	{
		if(nums.length==0)  return new int[] {-1,-1};
		int min = 0 ;
		int max=nums.length-1;
		while(min<=max)
		{
			int mid  = (min+max)/2;
		        	
		    if(nums[mid] == target)
		    {
		    	min=mid;
		        while(mid>0)
		        {			   		
		        	if(nums[mid-1]!=target || mid==0) break;
		        	mid--;		
		        }
		        while(min<max)
		        {
		        	if(nums[min+1]!=target || mid==nums.length-1) break;
		        	min++;		
		        }
		        		
		        return new int[] {mid,min};
		     }
		        	
		     else if(nums[mid]<target) 
		    	 min=mid+1;
		     else 
		    	 max=mid-1;       		
		 }
		
		return new int[] {-1,-1};
	}
}
