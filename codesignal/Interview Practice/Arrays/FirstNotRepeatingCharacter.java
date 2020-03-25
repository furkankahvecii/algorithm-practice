/*
 * https://app.codesignal.com/interview-practice/task/uX5iLwhc6L5ckSyNC
*/

char firstNotRepeatingCharacter(String s) {
	HashMap<Character,Integer> hmap = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			if(hmap.containsKey(c)) {
				hmap.put(c,hmap.get(c)+1);
			}
			else
				hmap.put(c, 2);
		}
		
		for(char a : s.toCharArray()) {
			if(hmap.get(a) == 1)
				return a;
		}
		
		return '_';
}
