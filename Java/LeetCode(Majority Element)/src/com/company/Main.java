package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int count,major;
        int[] array=new int[7];
        Random r=new Random();
        for(int i=0;i<array.length;i++)
        {
            array[i]=r.nextInt(2);
        }
        count=1;
        major=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(count==0)
            {
                major=array[i];
                count++;
            }
            else if(array[i]==major)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        System.out.println(major);
    }
}
