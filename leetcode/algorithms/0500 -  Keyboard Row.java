/*
* https://leetcode.com/problems/keyboard-row/
*/



import java.util.*;

class Solution 
{
    public String[] findWords(String[] words) 
    {
    	  Map<Character,Integer>  letterRow = new HashMap<Character,Integer>();
	      letterRow.put('q', 0);letterRow.put('a', 1);letterRow.put('z', 2);
	      letterRow.put('w', 0);letterRow.put('s', 1);letterRow.put('x', 2);
	      letterRow.put('e', 0);letterRow.put('d', 1);letterRow.put('c', 2);
	      letterRow.put('r', 0);letterRow.put('f', 1);letterRow.put('v', 2);
	      letterRow.put('t', 0);letterRow.put('g', 1);letterRow.put('b', 2);
	      letterRow.put('y', 0);letterRow.put('h', 1);letterRow.put('n', 2);
	      letterRow.put('u', 0);letterRow.put('j', 1);letterRow.put('m', 2);
	      letterRow.put('i', 0);letterRow.put('k', 1);
	      letterRow.put('o', 0);letterRow.put('l', 1);
	      letterRow.put('p', 0);
	      
	      ArrayList<String> validList = new ArrayList<String>();
	      
	      for(int i=0;i<words.length;i++)
	      {
	    	  if(words[i].length()==1)
    		  {
    			  validList.add(words[i]);
    			  continue;
    		  }
	    	  for(int j =0;j<words[i].length()-1;j++)
		      {
	    		  if(letterRow.get(Character.toLowerCase(words[i].charAt(j))) != letterRow.get(Character.toLowerCase(words[i].charAt(j+1))))
	    			  break;			  
	    		  else
	    		  {
	    			  if(j==words[i].length()-2)
		    			  validList.add(words[i]);
	    		  }	
		      }
	      }          
	      String[] validArray = new String[validList.size()];
	      
	      for(int i=0;i<validArray.length;i++)
	    	  validArray[i]=validList.get(i);
	      
	      return validArray;
    }
}