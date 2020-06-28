/*
 * https://leetcode.com/problems/path-crossing/
 */



class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int a =0,b = 0;
        set.add(a+"-"+b);

        for(Character character : path.toCharArray()) {
        	switch(character) {
	        	case 'N' : a++; break;
	        	case 'E' : b++; break;
	        	case 'S' : a--; break;
	        	case 'W' : b--; break;
        	}
        	
        	if(!set.add(a+"-"+b)) return true;
        }
        
        return false;  
    }
}
