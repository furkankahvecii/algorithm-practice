/*
 * https://app.codesignal.com/arcade/intro/level-9/6M57rMTFB9MeDeSWo
*/

boolean bishopAndPawn(String bishop, String pawn) {
    if(bishop.charAt(0) == pawn.charAt(0) || bishop.charAt(1) == pawn.charAt(1))
	return false;
	int a = Math.abs((int)bishop.charAt(0) - (int)pawn.charAt(0));
	int b = Math.abs((int)bishop.charAt(1) - (int)pawn.charAt(1));
	if(a == b)
		return true;
	return false;
}
