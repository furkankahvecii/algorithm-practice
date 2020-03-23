/*
 * https://app.codesignal.com/arcade/intro/level-10/PHSQhLEw3K2CmhhXE
*/

boolean isBeautifulString(String inputString) {
	HashMap<Character,Integer> hmap = new HashMap<>();
	for(char a : inputString.toCharArray()) {
		if(hmap.containsKey(a))
			hmap.put(a, hmap.get(a)+1);
		else {
			hmap.put(a, 1);
		}
	}

	int count = 0, max = 0;
	for(char a : hmap.keySet()) {
		if(a - 'a' != count++) {
			return false;
		}
			
		else {
			if(max<hmap.get(a) && max == 0)
				max = hmap.get(a);
			else if (max<hmap.get(a) && max != 0) {
				return false;
			}
			else 
				max = hmap.get(a);
		}
	}
	
	return true;
}
