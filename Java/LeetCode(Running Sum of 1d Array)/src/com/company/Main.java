package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] nums=new int[5];
        Random r=new Random();
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                nums[i] = r.nextInt(15);
                System.out.println("Random number is:"+nums[i]);
            }
            else
            {
                nums[i] = r.nextInt(15);
                System.out.println("Random number is:"+nums[i]);
                nums[i] = nums[i - 1] + nums[i];
            }

        }
        System.out.println("Finish");
        for(int num:nums)
            System.out.println(num);

    }
}
