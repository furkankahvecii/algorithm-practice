/*
 * https://leetcode.com/problems/unique-email-addresses/
 */


import java.util.*;

class Solution 
{
    public int numUniqueEmails(String[] emails) 
    {
        if(emails.length==0 || emails==null) return 0;
		Set<String> sum = new HashSet<String>();
		StringBuilder str = new StringBuilder();
		for(String mail : emails)
		{
			String split[] = mail.split("@");
			for(int i=0;i<split[0].length();i++)
			{
				if(mail.charAt(i)=='.')
					continue;
				if(mail.charAt(i)=='+')
					break;
				str.append(mail.charAt(i));
			}
			str.append("@"+split[1]);
			if(sum.add(str.toString()))
			{
				
			}
			str.setLength(0);
		}
		return sum.size();
    }   
}