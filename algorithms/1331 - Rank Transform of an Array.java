/*
 * https://leetcode.com/problems/rank-transform-of-an-array/
*/



class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) {
			return new int[0];
		}

        int[] temp = arr.clone();
		Arrays.sort(temp);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] rankList = new int[arr.length];
	    int rank = 1;
	    map.put(temp[0], rank);
		
	    for(int i=1;i<arr.length;i++) {
	    	if(temp[i] != temp[i-1]) {
	    		rank++;
	    		map.put(temp[i],rank);
	    	}
	    }
	    
	    for(int i=0;i<arr.length;i++) {
	    	rankList[i] = map.get(arr[i]);
	    }
	    	    
	    return rankList;
    }
}