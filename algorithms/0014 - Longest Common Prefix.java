/*
* https://leetcode.com/problems/longest-common-prefix/
*/



import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
        	minLen = Math.min(minLen, str.length());
        String sonuc="";
		for(int i=0;i<minLen;i++)
		{
			for(int j=0;j<strs.length-1;j++)
			{
				if(strs[j].charAt(i) != strs[j+1].charAt(i))
				{
					if(sonuc!="") return sonuc;
					else return "";
				}
			}
			sonuc+=strs[0].charAt(i);
		}
		return sonuc;
    }
}