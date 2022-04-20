package com.company;

import java.util.Random;

public class Main {
//Herhangi bir dizi istenecek dizi 0dan başlayıp ne kadar gidecek
//İçindeki bir sayı eksik olacak ve program bize eksik olan sayıyı çıktı olarak verecek.
    public static void main(String[] args)
    {
        Random r=new Random();
        int x,y;
        y=0;
        x=r.nextInt(100)+1;
        int[] array=new int[x];
        for(int i=0;i<x;i++)
        {
            if(x/2==i){}
            else
            {
              array[i]=i;
            }
        }
        for(int i=1;i<x;i++)
        {
            y=y+array[i];
        }
        for(int i=0;i<x;i++)
        {
            System.out.println(array[i]);
        }
        x=x*(x-1)/2;
        y=x-y;
        System.out.println("Eksik olan="+y);

    }
}
