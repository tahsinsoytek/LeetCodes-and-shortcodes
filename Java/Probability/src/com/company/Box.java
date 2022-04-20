package com.company;

public class Box
{
    Ball[] balls;
    Box(int numberOfBalls)
    {
        balls=new Ball[numberOfBalls];
    }
    public void coloringBalls(int[] x)
    {
        int counter=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<x[i];j++)
            {
                balls[counter]=new Ball();
                if(i==0)
                {
                    balls[counter].color="Kırmızı";
                }
                else if(i==1)
                {
                    balls[counter].color="Yeşil";
                }
                else
                {
                     balls[counter].color="Mavi";
                }
                counter++;
            }
        }
    }

}
