package com.company;

import java.util.Random;
//İki tane kutumuz var.Birinci kutuda 2 siyah 1 beyaz,ikinci kutuda 3 siyah 2 beyaz top var.
//Birinci kutudan herhangi bir top seçiyoruz ve ikinci kutuya atıyoruz.
//İkinci kutudan gelen top beyazsa birinciden beyaz çekme ihtimalimizin simülasyonu yapılacak.
public class Main {

    public static void main(String[] args)
    {
        Random r=new Random();
        double counter=0;
        double counter2=0;
        double probability=0;
        for(int i=0;i<1000000;i++)
        {
            int x=r.nextInt(3);//0,1 veya 2 dönderir.0 gelirse beyaz çekmiştir.
            int y;
            int box2White=2;
            if(x==0)
            {
                box2White++;
            }
            y=r.nextInt(6)+1;
            if(y<=box2White)//Beyaz top çekilmiştir ve birinciden beyaz gelmiştir.
            {
                counter2++;
                if(x==0)
                {
                counter++;
                }
            }
        }
        probability=(counter/counter2)*100;
        System.out.println("%"+probability);
}
}
