package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=input.nextInt();
        z=notThree(n);
        System.out.println("Number of numbers without 3 number-->"+z);

    }
    public static int notThree(int x)
    {
        int result=0;
        int number;
        boolean b;
        for(int i=0;i<x;i++)
        {
            b=true;
            number=i;
            while(number!=0&&b)
            {
                if(number%10==3)
                {
                    b=false;
                }
                else
                {
                    number/=10;
                }
            }
            if(b)
            {
                result++;
            }

        }
        return result;
    }
}
