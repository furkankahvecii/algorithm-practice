/*
 * https://app.codesignal.com/arcade/intro/level-8/rRGGbTtwZe2mA8Wov
*/

char firstDigit(String inputString) {
    for(char ch : inputString.toCharArray())
		if(Character.isDigit(ch))
			return ch;
	return '0';
}
