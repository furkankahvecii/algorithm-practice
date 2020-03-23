/*
 * https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP
*/

boolean areSimilar(int[] a, int[] b) {
	int s1=1,s2=1,count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i] != b[i])
			count++;
		s1 *= a[i];
		s2 *= b[i];
	}
	
	return s1 == s2 && count<=2;
}
