/*
 * https://app.codesignal.com/arcade/intro/level-8/Rqvw3daffNE7sT7d5
*/

int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int count =0,max = Integer.MIN_VALUE;
	for(int i=0;i<=inputArray.length-k;i++) {
		for(int j=i;j<i+k;j++) {
			count += inputArray[j];
		}
		if(count>max)
			max = count;
		count = 0;
	}
	
	return max;
}