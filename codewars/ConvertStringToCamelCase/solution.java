// https://www.codewars.com/kata/517abf86da9663f1d2000003

import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    StringBuilder result = new StringBuilder("");
    String[] array = s.replaceAll("_", " ").replaceAll("-", " ").split(" ");
    for(int i = 0 ; i<array.length;i++) {
      result.append(i == 0 ? array[i] : Character.toUpperCase(array[i].charAt(0)) + array[i].substring(1));
    }
    
    return result.toString();
  }
}
