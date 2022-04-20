package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[][] matrix={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int x=0;
        for(int i=0;i<matrix.length;i++)
        {
            x=matrix[i][0];
            for(int j=1;j<matrix[0].length;j++)
            {
                if(!(x>matrix[i][j]))
                {
                    matrix[i][j]=x;
                }
            }
        }
        for(int i=0;i<matrix.length-1;i++)
        {
            if(matrix[i][matrix[0].length-1]>matrix[i+1][matrix[0].length-1])
            {
                x=matrix[i][matrix.length-1];
            }
            else
            {
                x=matrix[i+1][matrix[0].length-1];
            }
        }

        System.out.println(x);
    }
}
