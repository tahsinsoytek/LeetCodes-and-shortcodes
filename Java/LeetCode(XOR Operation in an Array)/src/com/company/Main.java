package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n and start values:");
        System.out.println(xorOperation(input.nextInt(),input.nextInt()));
    }
    public static int xorOperation(int n,int start)
    {
        int result=start;
        for(int i=0;i<n-1;i++)
        {
            start+=2;
            result=result^start;
        }
        return result;
    }
}
