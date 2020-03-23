/*
 * https://app.codesignal.com/arcade/intro/level-2/bq2XnSr5kbHqpHGJC
*/

int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
	int fark = statues[statues.length-1] - statues[0] -1 ; 
	return fark - (statues.length-2);
}
