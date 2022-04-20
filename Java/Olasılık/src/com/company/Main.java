package com.company;

import java.util.Random;

public class Main {
//Torbada 10 tane top var 3 tanesi kırmızı 1 tanesi mavi 6 tanesi de sarı
//Torbadan rastgele seçilen topun hangi renk olma olasılığını deneysel yolla bulmaya çalışıyoruz.
    public static void main(String[] args)
    {
        Random r=new Random();
        int mavi,kirmizi,sari;
        mavi=0;
        kirmizi=0;
        sari=0;
        int x;
        double sonuc;
        for(int i=0;i<10000;i++)
        {
            x=r.nextInt(10)+1;;
            if(x==1)
            {
                mavi++;
            }
            else if(x>=2&&x<=4)
            {
                kirmizi++;
            }
            else
            {
                 sari++;
            }
        }
        sonuc=sari/100.0;
        System.out.println("Sari gelme olasiligi %"+sonuc);
        sonuc=kirmizi/100.0;
        System.out.println("Kirmizi gelme olasiligi %"+sonuc);
        sonuc=mavi/100.0;
        System.out.println("Mavi gelme olasiligi %"+sonuc);
    }
}
