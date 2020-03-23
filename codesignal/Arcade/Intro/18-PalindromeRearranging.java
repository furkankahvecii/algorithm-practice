/*
 * https://app.codesignal.com/arcade/intro/level-4/Xfeo7r9SBSpo3Wico
*/

boolean palindromeRearranging(String inputString) {
   HashMap<Character,Integer> hs = new HashMap<>();
	int count = 0;
	
	for(char a : inputString.toCharArray()) {
		if(hs.containsKey(a)) {
			hs.put(a, hs.get(a) + 1);
		}
		else
			hs.put(a,1);
	}
	
	for(int a : hs.values()) {
		if(a % 2 !=0) {
			count++;
		}
	}
	
	return count<=1;
}
