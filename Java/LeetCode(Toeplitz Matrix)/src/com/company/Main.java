package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        boolean b=true;
        int row,column;
        System.out.println("Please enter row:");
        row=input.nextInt();
        System.out.println("Please enter column:");
        column=input.nextInt();
        int[][] matrix=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                matrix[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<row-1&&b;i++)
        {
            for(int j=0;j<column-1&&b;j++)
            {
                    if(matrix[i][j]!=matrix[i+1][j+1])
                    {
                        b=false;
                    }
            }
        }
        System.out.println(b);



    }
}
