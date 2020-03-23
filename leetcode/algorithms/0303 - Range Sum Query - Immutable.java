/*
 * https://leetcode.com/problems/range-sum-query-immutable/
 */



class NumArray 
{
    private int[] nums;
    public NumArray(int[] nums) 
    {
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) 
    {
        int count=0;
	    for(int q=i;q<=j;q++)
	        	count+=this.nums[q];
	    return count;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */