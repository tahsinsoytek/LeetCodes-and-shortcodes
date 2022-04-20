package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[][] A={{1,0,-1},{2,7,-5},{4,-3,2},{-1,3,0}};
        A=TransposeOperation(A);
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Tranpose of A");
        A=TransposeOperation(A);
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static int[][] TransposeOperation(int[][] x)
    {
        int[][] newMatrix=new int[x[0].length][x.length];
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[0].length;j++)
            {
                newMatrix[j][i]=x[i][j];
            }
        }
        return  newMatrix;
    }
}
