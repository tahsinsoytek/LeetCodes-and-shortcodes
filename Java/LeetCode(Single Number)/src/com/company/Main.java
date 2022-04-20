package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] array={13,7,5,2,13,9,8,9,2,5,1,1,7};
        int bool=0;
        for(int i:array)
        {
            bool^=i;
        }
        System.out.println(bool);
    }
}
