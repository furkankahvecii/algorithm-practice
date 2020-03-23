/*
 * https://www.hackerrank.com/challenges/runningtime/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   // Complete the runningTime function below.
    static int runningTime(int[] arr) {
       
        int count = 0;

        for(int i=1 ; i<arr.length;i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j-=1;
                count++;
            } 

            arr[j+1] = key; 
            
        }

        return count;
    }
}