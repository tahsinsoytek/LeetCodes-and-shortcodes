package com.company;
import com.sun.istack.internal.localization.NullLocalizable;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int randVar,x,length;
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        String string=new String();
        System.out.println("Enter the length of the string:");
        x=input.nextInt();
        for(int i=0;i<x;i++)
        {
            string+=(char)(r.nextInt(25)+97);
        }
        System.out.println(string);
        length=string.length();
        randVar=r.nextInt(5)+5;
        for(int i=0;i<randVar;i++)
        {
            string+=string.charAt(r.nextInt(length));
        }
        System.out.println(string);
        System.out.println("After...");
        System.out.println(reducingOperation(string));
        System.out.println(reducingOperation("aaabccddd"));
        System.out.println(reducingOperation("aa"));
        System.out.println(reducingOperation("baab"));
    }
    public static String reducingOperation(String s)
    {
        char[] chars = s.toCharArray();
        boolean b;
        for (int i = 0; i < chars.length - 1; i++)
        {
            b = true;
            for (int j = i + 1; j < chars.length&&b; j++)
            {
                if (chars[i] == chars[j] && chars[i] != ' ')
                {
                    chars[i] = ' ';
                    chars[j] = ' ';
                    i--;
                    b = false;
                }
            }
        }
        StringBuilder strb=new StringBuilder(String.valueOf(chars));
        for(int i=0;i<strb.length();i++)
        {
            if(strb.charAt(i)==' ')
            {
                strb.deleteCharAt(i);
                i--;
            }
        }
        s=strb.toString();
        if(s.length()==0)
        {
            return "Empty String";
        }
        return s;
    }
}
