/*
 * https://www.hackerrank.com/challenges/strong-password/problem
 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword 
{
    static int minimumNumber(int n, String password) 
    {
        int count = 0;

        Pattern patternDigit = Pattern.compile("(\\d)");
        Pattern patternUpper = Pattern.compile("([A-Z])");
        Pattern patternLower = Pattern.compile("([a-z])");
        Pattern patternSpecial = Pattern.compile("(\\W)");
      
        Matcher matcherDigit = patternDigit.matcher(password);
        Matcher matcherUpper = patternUpper.matcher(password);
        Matcher matcherLower = patternLower.matcher(password);
        Matcher matcherSpecial = patternSpecial.matcher(password);
      
        if(!matcherDigit.find())  count++;    
        if(!matcherUpper.find())  count++;        
        if(!matcherLower.find())  count++;
        if(!matcherSpecial.find())  count++;
      
        if (count==1 && password.length()==5)
            count = 1;
        else if((count+password.length()<6))
            count = 6-password.length();
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
