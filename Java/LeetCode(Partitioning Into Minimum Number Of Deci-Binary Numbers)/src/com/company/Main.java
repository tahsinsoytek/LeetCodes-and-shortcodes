package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String x;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter string:");
        x=input.next();
        System.out.println(minPartitions(x));
    }
    public static int minPartitions(String n)
    {
        char c=n.charAt(0);
        int index=0;
        boolean b=true;
        for(int i=0;i<n.length()-1&&b;i++)
        {
            if(c<n.charAt(i+1))
            {
                c=n.charAt(i+1);
                index=i+1;
            }
            if(c==57)
            {
                b=false;
            }
        }
        return (Integer.valueOf(String.valueOf(n.charAt(index))));

    }
}
