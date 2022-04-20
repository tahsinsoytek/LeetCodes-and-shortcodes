package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int rowNumber;
        String regulation;
        Scanner input=new Scanner(System.in);
        System.out.println("How many rows should the Pascal triangle be?");
        rowNumber=input.nextInt();
        int[][] pascalTriangle=new int[rowNumber][];
        for(int i=1;i<=rowNumber;i++)
        {
            pascalTriangle[i-1]=new int[i];
            for(int j=0;j<i;j++)
            {
                if(j==0||j==i-1)
                {
                    pascalTriangle[i-1][j]=1;
                }
                else
                {
                    pascalTriangle[i-1][j]=pascalTriangle[i-2][j-1]+pascalTriangle[i-2][j];
                }
            }
        }
        for(int i=0;i<pascalTriangle.length;i++)
        {
            for(int j=0;j<pascalTriangle[i].length;j++)
            {

                System.out.print(pascalTriangle[i][j]+" ");
            }
            System.out.println();
        }

    }
}
