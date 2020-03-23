/*
* https://leetcode.com/problems/add-digits/
*/



class Solution {
    public int addDigits(int num) 
    {
    	int temp=0;
		while(num>9)
		{
			temp=num;
			num=0;
			while(temp>0)
			{
				num+=temp %10;
				temp=temp/10;
			}
		}
		return num;
    }
}