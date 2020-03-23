/*
* https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatsandaMouse
{
	static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(x-z);
        int b = Math.abs(y-z);
        if(a == b) return "Mouse C";
        else if (a<b) return "Cat A";
        return "Cat B";
    }
}