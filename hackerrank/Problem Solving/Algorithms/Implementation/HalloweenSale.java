/*
* https://www.hackerrank.com/challenges/halloween-sale/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HalloweenSale 
{
	static int howManyGames(int p, int d, int m, int s) {
        int gameCount = 0;
        while(s>p) {
           s-=p;
           p = Math.max(p-d,m);
           gameCount++;
       }
       
       return gameCount;
    }
}