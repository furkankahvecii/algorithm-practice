/*
 * https://app.codesignal.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ
*/

int shapeArea(int n) {
    if(n == 1) return 1;
    int count = 1;
	int sum = 0;
		for(int i = 2; i < n ; i++) {
			sum+=(count*2);
			count+=2;
			if(i+1 == n)
				sum += count;
		}
		
	return sum;
}