package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n;
        int[] LeonardoSequence;
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers do you want from the Leonardo Number Sequence?");
        n=input.nextInt();
        LeonardoSequence=LeonardoNumberSequence(n);
        for(int i=0;i<LeonardoSequence.length;i++)
        {
            System.out.println(i+1+".number is:"+LeonardoSequence[i]);
        }
        System.out.println("Which index number do you want?");
        n=input.nextInt()-1;
        System.out.println(n+1+".number is:"+recursive(n));
    }
    public static int[] LeonardoNumberSequence(int x)
    {
        int[] sequence=new int[x];
        sequence[0]=1;
        sequence[1]=1;
        for(int i=2;i<x;i++)
        {
            sequence[i]=sequence[i-1]+sequence[i-2]+1;
        }
        return sequence;
    }
    public static int recursive(int x)
    {
        if(x==0||x==1)
        {
            return 1;
        }
        return recursive(x-1)+recursive(x-2)+1;
    }
}
