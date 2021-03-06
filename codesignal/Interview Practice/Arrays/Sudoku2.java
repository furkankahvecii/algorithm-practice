/*
 * https://app.codesignal.com/interview-practice/task/SKZ45AF99NpbnvgTn
*/

boolean sudoku2(char[][] board) {
	Set<Character> horizontalSet = new HashSet<Character>();
	Set<Character> verticalSet = new HashSet<Character>();
	Set<Character> threeXthree = new HashSet<Character>();
	
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			if(!horizontalSet.add(board[i][j]) && board[i][j] != '.') return false;
			if(!verticalSet.add(board[j][i]) && board[j][i] != '.') return false;
			
			if(j%3==0 && i%3==0)
			{
				for(int k = i ; k<=(i+2);k++)
				{
					if(!threeXthree.add(board[k][j]) && board[k][j] != '.') return false;
					if(!threeXthree.add(board[k][j+1]) && board[k][j+1] != '.') return false;
					if(!threeXthree.add(board[k][j+2]) && board[k][j+2] != '.') return false;
				}
				threeXthree.clear();
			}		
		}	
		horizontalSet.clear();
		verticalSet.clear();	
	}	
	return true;
}   

