package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("Enter a number:");
        x=input.nextInt();
        int counter=0;
        while(x!=0)
        {
            if(x%2==0)
            {
                x=x/2;
            }
            else
            {
               x--;
            }
            counter++;
        }
        System.out.println("Number of steps:"+counter);
    }
}
