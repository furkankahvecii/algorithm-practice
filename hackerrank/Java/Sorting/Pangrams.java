/*
 * https://www.hackerrank.com/challenges/pangrams/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the introTutorial function below.
    static String pangrams(String s) {
        
        if(s.length()<26){
            return "not pangram ";
        }
        
        int[] alphabet = new int[26];
        int count = 0;

        for(char q : s.toCharArray()){
            if(!Character.isLetter(q))
                continue;

            if(alphabet[Character.toLowerCase(q)-'a'] == 0) {
                count++;
                alphabet[Character.toLowerCase(q)-'a']++;
            }    
        }
        
        return count == 26 ? "pangram" : "not pangram";
    }
}