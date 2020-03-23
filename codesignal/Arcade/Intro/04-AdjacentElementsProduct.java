/*
 * https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m
*/

int adjacentElementsProduct(int[] inputArray) {
    int number = inputArray[0] * inputArray[1];
		for(int i = 0 ; i <inputArray.length-1;i++) {
			int a = inputArray[i] * inputArray[i+1];
			if(number < a)
				number = a;
		}
		
		return number;
}
