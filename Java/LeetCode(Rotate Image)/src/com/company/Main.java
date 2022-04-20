package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int size;
    public static void main(String[] args)
    {
        Random r=new Random();
        Scanner input=new Scanner(System.in);
        System.out.print("Matrix size:");
        size=input.nextInt();
        int[][] matrix=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                matrix[i][j]=r.nextInt(10);
            }
        }
        System.out.println("Before Rotate");
        displayMatrix(matrix);
        rotate(matrix);
        System.out.println("After Rotate");
        displayMatrix(matrix);
    }
    public static void displayMatrix(int[][] matrix)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix)
    {
        for (int i = 0; i < (size + 1) / 2; i++)
        {
            for (int j = 0; j < size / 2; j++)
            {
                int temp = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - j - 1];
                matrix[size - 1 - i][size - j - 1] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }

    }
}
