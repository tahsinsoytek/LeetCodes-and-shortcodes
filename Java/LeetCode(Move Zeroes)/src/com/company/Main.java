package com.company;

public class Main {

    public static void main(String[] args)
    {
        int[] array={0,7,0,9,32,0,2,8,12};
        int x=0;
        int temp;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==0)
            {
                x++;
            }
            else if(x!=0)
            {
                temp=array[i];
                array[i]=array[i-x];
                array[i-x]=temp;
            }
        }
        for(int nums:array)
        {
            System.out.println(nums);
        }
    }
}
