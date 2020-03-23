/*
 * https://leetcode.com/problems/reverse-string-ii/
 */



class Solution 
{
    public String reverseStr(String s, int k) 
    {
    	if(k==0) return s;
    	if(s.length()==0) return "";
    	StringBuilder answer = new StringBuilder();
    	StringBuilder a = new StringBuilder(); 
		int count=0;
		for(int i=0;i<s.length();i+=k)
		 {
			 if(i+k > s.length())
				a.append(s.substring(i,i + s.length() - i));
			 
			 else
				 a.append(s.substring(i,i+k));
			 
			 if(count%2==0)
				 answer.append(a.reverse());
			 
			 else
				 answer.append(a);
			 
			 a.setLength(0);
			 count++; 
		 }
		 
		 return answer.toString(); 
	}
}