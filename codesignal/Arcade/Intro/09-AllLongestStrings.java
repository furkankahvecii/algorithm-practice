/*
 * https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
*/

String[] allLongestStrings(String[] inputArray) {
	if(inputArray.length == 0 || inputArray == null) return new String[] {};
	ArrayList<String> array = new ArrayList<String>();
	
	int length = inputArray[0].length();
	array.add(inputArray[0]);
	
	for(int i = 1 ; i<inputArray.length;i++) {
		if(length<inputArray[i].length()) {
			array.clear();
			array.add(inputArray[i]);
			length = inputArray[i].length();

		}
		else if (length == inputArray[i].length()) {
			array.add(inputArray[i]);
		}
	}
	
	Object[] objArr = array.toArray();
	String[] str = Arrays.copyOf(objArr, objArr.length,String[].class);
	return str;	
}
