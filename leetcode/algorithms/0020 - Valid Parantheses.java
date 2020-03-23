/*
* https://leetcode.com/problems/valid-parentheses/ 
*/



import java.util.*;

class Solution {
    public boolean isValid(String s) {
		ArrayList<Character> stack = new ArrayList<Character>();
		Map<Character, Character> paranthses = new HashMap<Character, Character>();
		paranthses.put('(', ')');
		paranthses.put('{', '}');
		paranthses.put('[', ']');
			
		for(int i=0;i<s.length();i++)
		{
			if(paranthses.containsKey(s.charAt(i)))
			{
				stack.add(s.charAt(i));
			}		
			else
			{
				if(stack.size()!=0  && paranthses.get(stack.get(stack.size()-1)) == s.charAt(i))
				{
					stack.remove(stack.size()-1);
				}
				else
				{
					return false;
				}						
			}
		}
        return stack.isEmpty();
    }
}