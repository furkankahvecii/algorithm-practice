/*
* https://www.hackerrank.com/challenges/sherlock-and-squares/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockandSquares {

    static int squares(int a, int b) 
    {
    	String variable = String.valueOf(Math.sqrt(a));
		if(variable.charAt(variable.length()-1) == '0' && variable.charAt(variable.length()-2) == '.')
		{
			return 1 + (int) Math.sqrt(b)   - (int) Math.sqrt(a) ;
		}
		
		return (int) Math.sqrt(b)   - (int) Math.sqrt(a) ;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            int result = squares(a, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
