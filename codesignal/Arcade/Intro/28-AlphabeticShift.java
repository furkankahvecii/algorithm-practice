/*
 * https://app.codesignal.com/arcade/intro/level-6/PWLT8GBrv9xXy4Dui
*/

String alphabeticShift(String inputString) {
	StringBuilder str = new StringBuilder("");
    for(char a : inputString.toCharArray()) {
        if(a=='z')
            a = 'a';
        else 
            a++;
        
        str.append(a);
    }
    
    return str.toString();
}
