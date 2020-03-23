/*
 * https://www.hackerrank.com/challenges/java-singleton/problem
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton
{
    private volatile static Singleton instance;
    public String str;
    private Singleton()
    {
        
    }
    
    static Singleton getSingleInstance()
    {
        if(instance == null)
        {
            synchronized(Singleton.class)
            {
                instance = new Singleton();
            }
        }
        return instance;
    }
}

public class JavaSingletonPattern
{
    public static void main(String[] args) throws Exception
    {

    }
}