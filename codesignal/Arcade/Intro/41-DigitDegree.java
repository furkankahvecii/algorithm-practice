/*
 * https://app.codesignal.com/arcade/intro/level-9/hoLtYWbjdrD2PF6yo
*/

int digitDegree(int n) {
    if(n>=0 && n<10) return 0;
	int steps = 0;

	while(n>9) {
		n = toplamSayi(n);
		steps++;
	}
	
	return steps;
}

int toplamSayi(int n) {
	int count = 0;
	while(n>0) {
		count += n%10;
		n/=10;
	}
	
	return count;
}
