package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String text;
        text=input.nextLine();
        text=FilteredText(text);
        text=text.toUpperCase();
        System.out.println(IsPalindrome(text));
    }
    public static String FilteredText(String x)
    {
        String text="";
        for(int i=0;i<x.length();i++)
        {
            if(Character.isLetterOrDigit(x.charAt(i)))
            {
                text=x.charAt(i)+text;
            }
        }
        return text;
    }
    public static boolean IsPalindrome(String x)
    {
        boolean b=true;
        for(int i=0;i<x.length()/2&&b;i++)
        {
            if(x.charAt(i)!=x.charAt(x.length()-i-1))
            {
                b=false;
            }
        }
        return b;
    }
}
