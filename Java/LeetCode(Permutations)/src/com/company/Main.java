package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x;
        int[] numbers;
        System.out.println("Specify the number of numbers you want to enter:");
        x=input.nextInt();
        numbers=new int[x];
        int[][] permutations=new int[factorial(x)][x];
        System.out.println("The numbers you enter must be different from each other");
        for(int i=0;i<x;i++)
        {
            System.out.println(i+1+". number:");
            numbers[i]=input.nextInt();
            permutations[0][i]=numbers[i];
        }
        permutations(permutations);
        for(int i=0;i<permutations.length;i++)
        {
            for(int j=0;j<permutations[0].length;j++)
            {
                System.out.print(permutations[i][j]);
            }
            System.out.println();
        }
    }
    public static int factorial(int x)
    {
        int result=1;
        for(int i=x;i>1;i--)
        {
            result*=i;
        }
        return result;
    }
    public static int[][] permutations(int[][] x)
    {
        int temp,ctr;
        ctr=0;
        for(int i=1;i<x.length;i++)
        {
            x[i]= Arrays.copyOf(x[i-1],x[0].length);
            temp=x[i][ctr];
            x[i][ctr]=x[i][ctr+1];
            x[i][ctr+1]=temp;
            if(ctr==x[0].length-2)
            {
                ctr=0;
            }
            else
            {
                ctr++;
            }
        }
        return x;
    }
}
