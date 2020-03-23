/*
 * https://app.codesignal.com/arcade/intro/level-7/ZFnQkq9RmMiyE6qtq
*/

int absoluteValuesSumMinimization(int[] a) {
     int index = Integer.MAX_VALUE;
	int result = 0;
	int count = 0;
	for(int i = 0 ; i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			count += Math.abs(a[j] - a[i]);
		}
		if(count < index) {
			result = a[i];
			index = count;
		}
		count = 0;
	}
	return result;
}
