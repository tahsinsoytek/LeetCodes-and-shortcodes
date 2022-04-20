package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.print("Enter the number:");
        x=input.nextInt();
        fibAndPrime(x);
    }
    public static boolean primeControl(int p)
    {
        boolean b;
        b=true;
        for(int i=2;i<=p/2&&b;i++)
        {
            if(p%i==0)
            {
                b=false;
            }
        }
        return b;
    }
    public static void fibAndPrime(int f)
    {
        int x,y,z,i;
        boolean b;
        x=0;
        y=1;
        i=1;
        while(x<f)
        {
            if(x>=2)
            {
                b=primeControl(x);
                if(b)
                {
                    System.out.println(i+". number is:"+x);
                    i++;
                }
            }
            z=x;
            x+=y;
            y=z;
        }
        System.out.println("Number of numbers found:"+(i-1));
    }
}
