// https://www.codewars.com/kata/554e4a2f232cdd87d9000038

import java.util.HashMap;
import java.util.Map;

public class DnaStrand {
  public static String makeComplement(String dna) {
    
    Map<Character,Character> map = new HashMap<>();
    map.put('A','T');
    map.put('C','G');
    map.put('T','A');
    map.put('G','C');

    StringBuilder str = new StringBuilder("");
      for(char c : dna.toCharArray())
      {
        str.append(map.get(c));
      }
      
      return str.toString();
  }
}
