/*
 * https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE
*/

int arrayMaximalAdjacentDifference(int[] inputArray) {
    int max = Integer.MIN_VALUE ;
	for(int i=0;i<inputArray.length-1;i++) {
		if(Math.abs(inputArray[i]-inputArray[i+1]) > max)
			max = Math.abs(inputArray[i]-inputArray[i+1]);
	}
	return max;
}
