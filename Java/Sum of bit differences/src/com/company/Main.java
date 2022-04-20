package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] numbers;
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers do you want to get the bit difference?");
        numbers=new int[input.nextInt()];
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Enter the "+(i+1)+".number:");
            numbers[i]=input.nextInt();
        }
        System.out.println(bitDiff(numbers));
    }
    public static int bitDiff(int[] numbers)
    {
        int result=0;
        int x;
        String s;
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
              x=numbers[i]^numbers[j];
              s=Integer.toBinaryString(x);
              for(int k=0;k<s.length();k++)
              {
                  if(s.charAt(k)=='1')
                  {
                      result++;
                  }
              }
            }
        }
        return result*2;
    }
}
