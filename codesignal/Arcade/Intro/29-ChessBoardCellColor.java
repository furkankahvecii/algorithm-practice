/*
 * https://app.codesignal.com/arcade/intro/level-6/t97bpjfrMDZH8GJhi
*/

boolean chessBoardCellColor(String cell1, String cell2) {
  	if( ((int)cell1.charAt(0) - 'A') % 2 == ((int)cell2.charAt(0) - 'A') % 2 ) {
		if(cell1.charAt(1)% 2 == cell2.charAt(1) % 2)
			return true;
		else
			return false;
	}
	else {
		if(cell1.charAt(1) % 2 == cell2.charAt(1) % 2)
			return false;
		else
			return true;
	}
}
