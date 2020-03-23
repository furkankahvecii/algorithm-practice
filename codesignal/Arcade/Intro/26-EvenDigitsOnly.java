/*
 * https://app.codesignal.com/arcade/intro/level-6/6cmcmszJQr6GQzRwW
*/

boolean evenDigitsOnly(int n) {
	while(n>0){
		if((n)%2 == 0)
			n = n/10;
		else 
			return false;
	}
	
	return true;
}
