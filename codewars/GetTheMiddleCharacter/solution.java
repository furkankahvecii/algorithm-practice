// https://www.codewars.com/kata/56747fd5cb988479af000028/

class Kata {
  public static String getMiddle(String word) {
    	int len = word.length();
	    return len % 2 == 0 ? word.substring(len/2-1, len/2+1) : word.substring(len/2,len/2+1) ;
  }
}
