package com.company;

import java.util.Random;
import java.util.Scanner;
//Deneysel olarak denenecek
public class Main
{
    public static void main(String[] args)
    {
        int r,l;
        double prob,expProb;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter range:");
        l=input.nextInt();
        r=input.nextInt();
        prob=(perfectSquare(l,r)/(r-l+1))*100;
        System.out.println("Probability result is %"+prob);
        expProb=experimental(l,r);
        System.out.println("Experimental result is %"+expProb);

    }
    public static double perfectSquare(int x,int y)
    {
        double result=0;
        for(int i=x;i<=y;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(j*j==i)
                {
                    result++;
                }
            }
        }
        return result;
    }
    public static double experimental(int x,int y)
    {
        Random r=new Random();
        int e;
        double result,counter;
        counter=0;
        for(int i=0;i<1000000;i++)
        {
            e=(r.nextInt(y-x+1))+x;
            for(int j=1;j*j<=e;j++)
            {
                if(j*j==e)
                {
                    counter++;
                }
            }
        }
        result=counter/10000;
        return result;
    }
}
