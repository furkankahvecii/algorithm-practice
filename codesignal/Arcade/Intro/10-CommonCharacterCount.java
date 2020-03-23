/*
 * https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32
*/

int commonCharacterCount(String s1, String s2) {
	int[] arrayS1 = new int[26];
	int[] arrayS2 = new int[26];
	int count = 0;
	for(char a : s1.toCharArray()) {
		arrayS1[a-'a']++;
	}
	for(char a : s2.toCharArray()) {
		arrayS2[a-'a']++;
	}
	
	for(int i = 0 ; i<arrayS1.length;i++) {
		if(arrayS1[i] != 0 && arrayS2[i] != 0) {
			count += Math.min(arrayS1[i], arrayS2[i]);
		}
	}
	
	return count;
}
