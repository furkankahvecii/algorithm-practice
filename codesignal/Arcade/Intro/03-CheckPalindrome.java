/*
 * https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ
*/

boolean checkPalindrome(String inputString) {
    StringBuilder str = new StringBuilder(inputString);
    return str.toString().equals(str.reverse().toString());
}
