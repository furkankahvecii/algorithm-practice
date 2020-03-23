/*
* https://www.hackerrank.com/challenges/utopian-tree/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UtopianTree
{
	static int utopianTree(int n) {
        int tree = 0;
        for(int i = 0; i <= n ;i++) {   
            if(i % 2 == 0)
                tree++;
            else
                tree*=2;
        }   
        return tree;
     }
}