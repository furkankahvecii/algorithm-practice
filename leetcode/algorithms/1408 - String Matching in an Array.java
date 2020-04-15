/*
 * https://leetcode.com/problems/string-matching-in-an-array/
*/



class Solution {
	 public List<String> stringMatching(String[] words) {
        if(words==null || words.length==0)
            return new ArrayList<String>();
		
		List<String> ans = new ArrayList<String>();
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(i!=j && words[i].indexOf(words[j]) !=-1 && !ans.contains(words[j]))
					ans.add(words[j]);
			}
		}
        
        return ans;
    }
}
