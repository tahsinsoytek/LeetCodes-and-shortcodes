package com.company;

import java.util.Scanner;

public class Main {
//Bir sayı girilmesi istenecek
//Girilen sayıya kadar olan sayıların(girilen sayı dahil) ikili gösterimde kaç tane 1 olduğunu çıktı olarak verecek.
//Mesela 3 girdik diyelim
//0da 0 tane 1 vardır 1de 1 tane bir vardır 2de 1 tane vardır(10) 3de ise 2 tane vardır(11)
//Yani çıktı (0,1,1,2)
//Sayi ikinin herhangi bir kuvvetinden bir eksikse sayının kuvveti kadar bir barındırır.
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,sayac;
        sayac=0;
        System.out.println("Sayi giriniz->");
        x=input.nextInt();
        int[] dizi=new int[x+1];
        for(int i=0;i<=x;i++)
        {
            for(int j=i;j>0;j/=2)
            {
                if(j%2!=0)
                {
                    sayac++;
                }
            }
            dizi[i]=sayac;
            sayac=0;
        }
        for(int i=0;i<=x;i++)
        {
            System.out.print(dizi[i]+",");
        }


    }
}
