/*
 * https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ
*/

boolean isLucky(int n) {
	String a = String.valueOf(n);
	int sum = 0;
	for(int i=0;i<a.length()/2;i++) {
			sum += Integer.valueOf(a.charAt(i));
			sum -= Integer.valueOf(a.charAt(a.length()-i-1));
	}
	
	return sum == 0 ;
}
