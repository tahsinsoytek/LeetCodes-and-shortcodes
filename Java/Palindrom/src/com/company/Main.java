package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        boolean b;
        String x;
        System.out.println("Kelime->");
        x=input.next();
        //System.out.println(x);
        b=true;
        for(int i=0;i<x.length()/2&&b;i++)
        {
            if(x.charAt(i)==x.charAt(x.length()-i-1))
            {

            }
            else
            {
                b=false;
            }
        }
        if(b)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Palindrom degil");
        }


    }
}
