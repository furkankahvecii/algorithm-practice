/*
 * https://app.codesignal.com/interview-practice/task/pMvymcahZ8dY4g75q
*/

int firstDuplicate(int[] a) {
    HashSet<Integer> hset = new HashSet<Integer>();
	for(int number : a) {
		if(hset.contains(number)) {
			return number;
		}
		else {
			hset.add(number);
		}
	}
	return -1;
}