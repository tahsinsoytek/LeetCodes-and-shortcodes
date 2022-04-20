package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        char[] string=new char[5];
        Random r=new Random();
        char temp;
        for(int i=0;i<string.length;i++)
        {
            string[i]=(char)(r.nextInt(26)+97);//randomly generated string example
            System.out.print(string[i]);
        }
        for(int i=0;i<string.length/2;i++)
        {
            temp=string[i];
            string[i]=string[string.length-i-1];
            string[string.length-i-1]=temp;
        }
        System.out.println("\n"+"After the procedure");
        for(int i=0;i<string.length;i++)
        {
            System.out.print(string[i]);
        }
    }
}
