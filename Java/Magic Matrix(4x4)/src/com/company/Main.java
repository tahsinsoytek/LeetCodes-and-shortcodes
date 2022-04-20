package com.company;


public class Main {

    public static void main(String[] args)
    {
        boolean b=true;
        int sumRow,sumColumn,sumDiagonal,sumDiagonal2;
        int[][] matrix={{8,11,14,1},{13,2,7,12},{3,16,9,6},{10,5,4,15}};
        sumDiagonal=0;
        sumDiagonal2=0;
        for(int i=0;i<4&&b;i++)
        {
            sumRow=0;
            sumColumn=0;
            for(int j=0;j<4;j++)
            {
                sumRow+=matrix[i][j];
                sumColumn+=matrix[j][i];
                if(i==0)
                {
                    sumDiagonal += matrix[j][j];
                    sumDiagonal2 += matrix[3 - j][j];
                }
            }
            if(!(sumRow==sumColumn&&sumColumn==sumDiagonal&&sumDiagonal==sumDiagonal2))
            {
                b=false;
            }
        }
        System.out.println(b);

    }
}
