// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

public class Accumul {
    public static String accum(String s) {
     String[] array = new String[s.length()];
		 int index = 0 ;
		 for(char ch : s.toCharArray())
		 {
			  array[index] = String.valueOf(ch).toUpperCase() + String.valueOf(ch).toLowerCase().repeat(index);
		    index++;
     }
		 return String.join("-", array);
    }
}
