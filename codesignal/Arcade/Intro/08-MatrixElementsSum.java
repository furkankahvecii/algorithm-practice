/*
 * https://app.codesignal.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr
*/

int matrixElementsSum(int[][] matrix) {
    ArrayList<Integer> column = new ArrayList<Integer>();
	int count = 0;
	for(int i = 0 ; i<matrix.length;i++) {
		for(int j = 0 ; j<matrix[0].length;j++) {
			if(column.contains(j))
				continue;
			if(matrix[i][j] == 0)
				column.add(j);
			else
				count += matrix[i][j];
				
		}
	}
	return count;
}
