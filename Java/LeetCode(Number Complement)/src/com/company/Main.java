package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,y,counter,subTotal;
        System.out.println("Enter a number:");
        x=input.nextInt();
        counter=0;
        y=0;
        for(int i=x;i>0;i/=2)
        {
            if(i%2==0)
            {
                subTotal=1;
                for(int j=0;j<counter;j++)
                {
                    subTotal*=2;
                }
                y+=subTotal;
            }
            counter++;
        }
        System.out.println(y);
    }
}
