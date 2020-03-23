/*
 * https://www.hackerrank.com/challenges/sha-256/problem
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.security.MessageDigest;

public class JavaSHA256
{
    static String hashFunction(String message,String hashAlgorithm) throws Exception
    {
        MessageDigest md = MessageDigest.getInstance(hashAlgorithm);

        md.update(message.getBytes());
    
        byte[] digest = md.digest();
                
        StringBuffer strBuffer = new StringBuffer();
        for(int a : digest)
            strBuffer.append(Integer.toString((a & 0xFF) + 0x100,16).substring(1));
                
        return strBuffer.toString();
    }

    public static void main(String[] args) throws Exception
    {
        Scanner sn = new Scanner(System.in);
        String message = sn.next();
        String hashAlgorithm = "SHA-256";
        String messageDigest = hashFunction(message,hashAlgorithm);
        System.out.println(messageDigest);
    }
}