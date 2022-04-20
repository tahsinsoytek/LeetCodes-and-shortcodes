package com.company;

import java.util.Scanner;

public class Main {
//Girilen sayıyı tek basamağa düşürene kadar basamaklarına ayrıştırıp topla.
//Mesela 15 1+5=6 yapılacak 59 5+9=14 1+4=5
    public static void main(String[] args)
    {
        int x;
        //int d1,d2;
        //boolean b=true;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz->");
        x=input.nextInt();
        if(x%9==0)
        {
            x=x%9+9;
        }
        else
        {
             x=x%9;
        }
        /*d1 = x % 10;
        d2 = (x - d1) / 10;
        if(x>=10)
        {
            x=(d1-9)+(d2%9);
            if(x<=0)
            {
                x=x+9;
            }
        }*/
        /*while(b)
        {
        d1=x%10;
        d2=(x-d1)/10;
        if(x>=10)
        {
            x=d1+d2;
        }
        else
        {
            b=false;
        }
        }*/
        System.out.println("Tek basamakli sayi="+x);
}
}
