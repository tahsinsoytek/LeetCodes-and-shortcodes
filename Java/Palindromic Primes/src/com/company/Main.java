package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.println("How many palindromic primes would you like to see?");
        x=input.nextInt();
        y=2;
        for(int i=0;i<x;)
        {
            if(IsPalindrome(y)&&IsPrime(y))
            {
                System.out.println(i+1+".number:"+y);
                i++;
            }
            y++;
        }
    }
    public static boolean IsPalindrome(int a)
    {
        String temp;
        boolean b=true;
        temp=Integer.toString(a);
        for(int i=0;i<(temp.length()/2)&&b;i++)
        {
            if(!(temp.charAt(i)==temp.charAt(temp.length()-i-1)))
            {
                b=false;
            }
        }
        return b;
    }
    public static boolean IsPrime(int a)
    {
        boolean b=true;
        for(int i=2;i<=a/2&&b;i++)
        {
            if(a%i==0)
            {
                b=false;
            }
        }
        return b;
    }
}
