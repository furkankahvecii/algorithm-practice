/*
* https://leetcode.com/problems/unique-morse-code-words/
*/



import java.util.*;

class Solution 
{
    static final String[] morseCode = 
    	{
            ".-", "-...", "-.-.", "-..", ".",               //a,b,c,d,e
            "..-.", "--.", "....", "..", ".---",            //f,g,h,i,g
            "-.-", ".-..", "--", "-.", "---",               //k,l,m,n,o
            ".--.", "--.-", ".-.", "...", "-",              //p,q,r,s,t
            "..-", "...-", ".--", "-..-", "-.--", "--.."     //u,v,w,x,y,z
    	};
   public int uniqueMorseRepresentations(String[] words) 
   {
       HashMap<Character,String> myMap =  new HashMap<Character,String>();
		HashSet<String> resultSet = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		char initial='a';
		for(String c : morseCode)
		{
			myMap.put(initial,c);
			initial++;
		}
		
		for(String word : words)
		{
			for(char s : word.toCharArray())
			{
				sb.append(myMap.get(s));
			}
			
			resultSet.add(sb.toString());
			sb = new StringBuilder();
		}				
      return resultSet.size();
   }
}