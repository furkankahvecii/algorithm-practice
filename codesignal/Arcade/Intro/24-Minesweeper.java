/*
 * https://app.codesignal.com/arcade/intro/level-5/ZMR5n7vJbexnLrgaM
*/

int[][] minesweeper(boolean[][] matrix) {
	int result[][] = new int[matrix.length][matrix[0].length];
	int count = 0;
	for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[i].length;j++) {
			if(j != matrix[i].length-1 && matrix[i][j+1])
				count++;
			if(i != matrix.length-1 && matrix[i+1][j] )
				count++;
			if(j != 0 && matrix[i][j-1])
				count++;
			if(i != 0 && matrix[i-1][j])
				count++;
			if(i!= matrix.length-1 && j != matrix[0].length-1  && matrix[i+1][j+1])
				count++;
			if(i!= 0 && j != 0 && matrix[i-1][j-1])
				count++;
			if(i!= 0 && j != matrix[i].length-1 && matrix[i-1][j+1])
				count++;
			if(j!=0 && i!= matrix.length-1 && matrix[i+1][j-1])
				count++;
			result[i][j] = count;
			count = 0;
		}
	}
	
	return result;
}
