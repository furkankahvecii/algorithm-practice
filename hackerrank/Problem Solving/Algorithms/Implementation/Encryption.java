/*
 * https://www.hackerrank.com/challenges/encryption/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption 
{
    static String encryption(String s) 
    {
        int row=0;
        int column=0;
        String conclusion="";
        for(int i=0;i<81;i++)
        {
            if(Math.pow(i, 2) >= s.length())
            {
                row=i-1;
                column=i;
                while(row * column < s.length())
                {
                    row++;
                }
                for(int j=0;j<column;j++)
                {
                    for(int k=0;k<row;k++)
                    {
                        if((k*column)+j >= s.length()) break;
                        conclusion+=s.charAt((k*column)+j);
                    }
                    conclusion+=" ";
                }
                return conclusion;
            }        
        }    
        return "";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
