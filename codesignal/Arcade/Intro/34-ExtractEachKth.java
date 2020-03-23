/*
 * https://app.codesignal.com/arcade/intro/level-8/3AgqcKrxbwFhd3Z3R
*/

Integer[] extractEachKth(int[] inputArray, int k) {
	List<Integer> list = new ArrayList<>();
		
	int nextToRemove = k;
	for (int i = 0; i < inputArray.length; i++) {
		if(i+1 == nextToRemove) {
			nextToRemove += k;
			continue;
		}
		
		list.add(inputArray[i]);
	}
	Integer[] outputArray = list.toArray(new Integer[list.size()]);
	
	return outputArray;
}
