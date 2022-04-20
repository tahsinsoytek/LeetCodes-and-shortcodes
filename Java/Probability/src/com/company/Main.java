package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int counter=0;
        int controller;
        Scanner input=new Scanner(System.in);
        boolean b=true;
        System.out.println("Kaç adet top istersiniz-->");
        Box box=new Box(input.nextInt());
        System.out.println("Kırmızı,Yeşil ve Mavi renk seçeneklerinden kaçar adet istediğinizi sırayla giriniz-->");
        int[] x=new int[3];
        for(int i=0;i<3;i++)
        {
            x[i]=input.nextInt();
        }
        box.coloringBalls(x);
        while (b)
        {
            System.out.println("Simülasyonu gerçekleştirmek için 1'e basın,çıkmak için 0'ı tuşlayın...");
            controller=input.nextInt();
            if(controller==1)
            {
                probFunction(box);
                counter++;
            }
            else if(controller==0)
            {
                b=false;
            }
        }
        System.out.println("Simülasyon "+counter+" kez gerçekleştirildi...");
    }
    public static void probFunction(Box b)
    {
        Random r=new Random();
        int x,y,z,t;
        x=0;
        y=0;
        z=0;
        for(int i=0;i<10000;i++)
        {
            t=r.nextInt(b.balls.length);
            if(b.balls[t].color=="Kırmızı")
            {
                x++;
            }
            else if(b.balls[t].color=="Yeşil")
            {
                y++;
            }
            else
            {
                z++;
            }
        }
        System.out.println("Kırmızı gelme olasılığı=%"+x/100.0);
        System.out.println("Yeşil gelme olasılığı=%"+y/100.0);
        System.out.println("Mavi gelme olasılığı=%"+z/100.0);
    }
}
