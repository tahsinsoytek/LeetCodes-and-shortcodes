package com.company;

import java.util.Scanner;

public class Main {
//Bir sayı girmeni isteyecek
//Girilen sayı herhangi iki sayının karesi şeklinde yazılıyorsa True dönderecek.
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x;
        boolean b;
        System.out.println("Sayi giriniz->");
        x=input.nextInt();
        b=true;
        for(int i=1;b&&(i*i)<x;i++)
        {
            for(int j=i;b&&(j*j)<x;j++)
            {
                if((i*i)+(j*j)==x)
                {
                    b=false;
                }
            }
        }
        if(!b)
        {
            b=true;
        }
        else
        {
            b=false;
        }
        System.out.println(b);
    }
}
