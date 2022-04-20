package com.company;

import java.util.Scanner;

public class Main {
/*Uzunluğu en az 6 olması lazım en az bir tane rakam olması lazım
en az bir tane küçük harf ardından ve bir tane büyük harf olması lazım
en az bir tane özel karakter olması lazım(!@#$%^&*()-+)
 */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string:");
        if(passwordController(input.next()))
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is not valid");
        }

    }
    public static boolean passwordController(String s)
    {
        boolean a,b,c,d;
        if(s.length()<6)
        {
            return false;
        }
        a=true;
        b=true;
        c=true;
        d=true;
        for(int i=0;i<s.length();i++)
        {
            if(a)
            {
                if(Character.isDigit(s.charAt(i)))
                {
                    a=false;
                }
            }
            if(b)
            {
                if(Character.isLowerCase(s.charAt(i)))
                {
                    b=false;
                }
            }
            if(c)
            {
                if(Character.isUpperCase(s.charAt(i)))
                {
                    c=false;
                }
            }
            if(d)
            {
                if(!(Character.isLetterOrDigit(s.charAt(i)))&&s.charAt(i)!=' ')
                {
                    d=false;
                }
            }
        }
        return !(a|b|c|d);
    }
}
