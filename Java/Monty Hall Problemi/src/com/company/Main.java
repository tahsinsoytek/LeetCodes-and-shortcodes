package com.company;

import java.util.Random;

public class Main {
//Monty Hall Probleminde önünüzde üç kapı vardır ve kapıların ikisi boştur ve birinde ise ödül vardır.
//Herhangi bir kapıyı seçersiniz.
//Sunucu iki kapıdan boş olanını açar.
//Sonra size seçiminizi değiştirmek isteyip istemediğinizi sorar.
//Eğer seçiminizi değiştirirseniz kazanma ihtimaliniz yükselecektir.
    public static void main(String[] args)
    {
        Random r=new Random();
        int kazanma,kazanma2;
        kazanma=0;
        kazanma2=0;
        double sonuc;
        int x,y,z;//z degeri sunucunun açacağı kapı
        z=0;
        boolean b;
        for(int i=0;i<1000000;i++)
        {
            x=r.nextInt(3)+1;//Arabanin oldugu kapi
            y=r.nextInt(3)+1;//Yarismacinin sectigi kapi
            if(x==y)
            {
                kazanma++;
            }
            if(x==1&&y==1)
            {
                z=r.nextInt(2)+2;
            }
            else if(x==2&&y==1||x==1&&y==2)
            {
                z=3;
            }
            else if(x==3&&y==1||x==1&&y==3)
            {
                z=2;
            }
            else if(x==2&&y==2)
            {
                b=r.nextBoolean();
                if(b)
                {
                    z=1;
                }
                else
                {
                    z=3;
                }
            }
            else if(x==2&&y==3||x==3&&y==2)
            {
                z=1;
            }
            else if(x==3&&y==3)
            {
                z=r.nextInt(2)+1;
            }
            y=y^z;
            if(x==y)
            {
                kazanma2++;
            }

        }
        System.out.println("Secimimizi degistirmediğiniz zaman");
        sonuc=kazanma/10000.0;
        System.out.println("Kazanma ihtimaliniz=%"+sonuc);
        System.out.println("Secimimizi degistirdiginiz zaman");
        sonuc=kazanma2/10000.0;
        System.out.println("Kazanma ihtimaliniz=%"+sonuc);
    }
}
