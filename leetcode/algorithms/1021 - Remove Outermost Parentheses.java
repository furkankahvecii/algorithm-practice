/*
 *https://leetcode.com/problems/remove-outermost-parentheses/ 
*/



class Solution 
{
    public String removeOuterParentheses(String S) 
    {
        StringBuilder sonuc = new StringBuilder();
		int count=0;
		for (int i = 0; i < S.length(); i++) 
		{
			if(S.charAt(i)=='(' && count++>0)
				sonuc.append('(');
			if(S.charAt(i)==')' && --count>0)
				sonuc.append(')');
		}
	    return sonuc.toString();
    }
}