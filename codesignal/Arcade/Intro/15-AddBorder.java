/*
 * https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN
*/

String[] addBorder(String[] picture) {
    String[] matrix = new String[picture.length+2];
		
	for(int i = 0 ; i<picture.length;i++)
	{
		matrix[i+1] = "*" + picture[i] + "*";
	}
	
	matrix[0] = matrix[1].replaceAll(".", "*");
	matrix[matrix.length-1]  = matrix[0];
	
	return matrix;
}
