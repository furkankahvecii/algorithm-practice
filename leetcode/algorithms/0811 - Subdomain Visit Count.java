/*
 * https://leetcode.com/problems/subdomain-visit-count/ 
*/


import java.util.*;

class Solution 
{
    public List<String> subdomainVisits(String[] cpdomains) 
    {
        if(cpdomains.length==0 && cpdomains == null)
			return null;
		
		List<String> answer = new ArrayList<String>();
		HashMap<String,Integer> output = new HashMap<String,Integer>();
		
		for(String domain : cpdomains)
		{
			int count = getCount(domain);
			for(int i=0;i<domain.length();i++)
			{
				if(domain.charAt(i) == ' ' || domain.charAt(i) == '.' )
				{
					String a = domain.substring(i+1,domain.length());
					output.put(a, output.getOrDefault(a, 0)+count);
				}
			}
		}
		for(String piece : output.keySet())
		{
			answer.add(output.get(piece) + " " + piece);
		}
		return answer;
			
    }
    public int getCount(String domain)
	{
		int i=0;
		for(;i<domain.length();i++)
		{
			if(domain.charAt(i) == ' ')
				break;
		}
		return Integer.valueOf(domain.substring(0,i));
	}
}
