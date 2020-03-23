/*
 * https://www.hackerrank.com/challenges/tutorial-intro/problem
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
    static int introTutorial(int V, int[] arr) {
        int counter = 0;

        for(int number : arr){
            if(number == V)
                return counter;
            counter++;
        }

        return -1;

    }
}