/*
* https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
*/



class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        int count = 1;
		Matcher m = Pattern.compile("(\\w\\w*)").matcher(sentence);
		
		while(m.find())
		{
			if( m.group().indexOf(searchWord) == 0)
				return count;
			count++;	
		}
		
		return -1;
    }
}

// with PHP
class Solution {

    /**
     * @param String $sentence
     * @param String $searchWord
     * @return Integer
     */
    function isPrefixOfWord($sentence, $searchWord) {
         $count = 1;
        preg_match_all("(\w\w*)", $sentence,$result,PREG_SET_ORDER);
        foreach($result as $word){
            if(strrpos($word[0], $searchWord) === 0)
                return $count;
            $count++;
        }
        return -1;
    }
}