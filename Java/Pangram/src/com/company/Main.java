package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String string;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        string=input.nextLine();
        System.out.println(IsPangram(string));
    }
    public static String IsPangram(String s)
    {
        char c=97;
        boolean b;
        StringBuilder str=new StringBuilder(s.toLowerCase());
        while(c<123)
        {
            b=true;
            for(int j=0;j<str.length()&&b;j++)
            {
                if(str.charAt(j)==c)
                {
                    str.deleteCharAt(j);
                    b=false;
                }
            }
            if(b)
            {
                System.out.println("The string lacks an " + c);
                return "not pangram";
            }
            else
            {
                c++;
            }
        }
        return "pangram";
    }
}
