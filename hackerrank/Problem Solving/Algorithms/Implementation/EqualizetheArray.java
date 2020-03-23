/*
* https://www.hackerrank.com/challenges/equality-in-a-array/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualizetheArray
{
    static int equalizeArray(int[] arr) 
    {
        int max = 1;
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int a : arr) {
            if(hmap.containsKey(a)) {
                hmap.put(a, hmap.getOrDefault(a, 0)+1);
                if( max < hmap.get(a))
                    max = hmap.get(a);
            }
            else
                hmap.put(a, 1);
        }

        return arr.length - max;
    }
}