/*
 * https://leetcode.com/problems/ugly-number/
*/



class Solution 
{
    public boolean isUgly(int num)
    {
        if(num<=0) return false;

		for(int i =2 ; i<=num/i ;i++)
		{
			while(num%i == 0)
			{
				num/=i;	
				if(!isUglyBoolean(i))
					return false;
			}
		}

		if(num>1)
		{
			if(!isUglyBoolean(num))
				return false;
		}
        else
            return true;
		
        return true;
		
    }
    public static boolean isUglyBoolean(int number)
	{
		if(number != 2 && number != 3 && number !=5)
			return false;
		
		return true;
	}
}