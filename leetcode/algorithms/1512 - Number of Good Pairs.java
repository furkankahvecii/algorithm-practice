/*
 * https://leetcode.com/problems/number-of-good-pairs/
 */



class Solution {
    public int numIdenticalPairs(int[] nums) {
		int res = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
        for (int a: nums) {
        	if(map.containsKey(a))
        		map.put(a, map.get(a)+1);
        	else
        		map.put(a,1);
        }
        
        for(int a : map.keySet())
        {
        	res += (map.get(a)-1) * map.get(a) /2;
        }
        
        return res;
    }
    
    public  int fack(int n)
	  {
		    if (n >= 1)
            return n * fack(n - 1);
        else
            return 1;	
	  }
}
