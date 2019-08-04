/*
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/ 
 */



class Solution 
{
    public String reverseWords(String s) 
    {
        if(s.length()==1)
			return s;
		StringBuilder answer = new StringBuilder();
		
		String[] whiteSpaces = s.split(" ");
		for(String a : whiteSpaces)
			answer.append(new StringBuilder(a).reverse()+" ");
		
		answer.deleteCharAt(answer.length()-1);
		
		return answer.toString();
    }
	public static boolean primeNumberChecker(int number)
	{
		if(number == 0 || number == 1)
			return false;
		for(int i=2;i<number;i++)
		{
			if(number%i == 0)
				return false;
		}
		return true;
	}
}