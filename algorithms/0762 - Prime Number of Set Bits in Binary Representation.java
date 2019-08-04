/*
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 */



class Solution 
{
   public static int countPrimeSetBits(int L, int R) 
	{
		int count = 0;
		for(int i=L;i<=R;i++)
		{
			if(primeNumberChecker((base2(i))))
				count++;
		}
		
		return count;
	}
   
	public static int base2(int number)
	{
		int count =0;
		while(number >0)
		{
			if(number%2 == 1)
				count++;
			number/=2;
		}
		return count;
	}
    
    public static boolean primeNumberChecker(int x)
	{
		return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
	}
}