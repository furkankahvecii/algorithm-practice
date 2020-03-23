/*
 * https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM
*/

int[] sortByHeight(int[] a) {
	int[] newArray = removeElement(a,-1);
	int count = 0;
	for(int i = 0 ; i<a.length;i++) {
		if(a[i] != -1) {
			a[i] = newArray[count];
			count++;
		}
	}
	return a;
}

int[] removeElement(int[] a, int k) {
	ArrayList<Integer> array = new ArrayList<>();
	for(int q : a) {
		if(q!=k)
			array.add(q);
	}
	int[] newArray = new int[array.size()];
	for(int i = 0 ; i<array.size();i++) {
		newArray[i] = array.get(i);
	}
	Arrays.sort(newArray);

	return newArray;
}