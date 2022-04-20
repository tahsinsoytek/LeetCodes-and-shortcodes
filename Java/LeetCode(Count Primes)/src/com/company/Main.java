package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int x;
        boolean b;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        x=input.nextInt();
        for(int i=2;i<x;i++)
        {
            b=true;
            for(int j=2;j<=i/2&&b;j++)
            {
                if(i%j==0)
                {
                    b=false;
                }
            }
            if(b)
            {
                System.out.println(i);
            }
        }
    }
}
