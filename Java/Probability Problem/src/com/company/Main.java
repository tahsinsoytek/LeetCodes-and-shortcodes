package com.company;
import java.util.Random;

/*elimizde 100 tane kutu var ve her kutunun içinde 2 beyaz 2 siyah top var
ilk kutudan başlayarak kutulardan topu çekip sırayla diğer kutuya atıyoruz
son kutuya geldiğimizde ise tekrar ilk kutuya kadar aynı işlem devam ediyor
en son çektiğimiz beyaz ise ilk atılanın beyaz olma olasılığı?*/
public class Main {
    public static void main(String[] args)
    {
        int total=0;
        double prob;
        String[] boxes=new String[101];//Son hücre olasılığın gerçekleşip gerçekleşmediğini söyler.
        for(int i=0;i<10000;i++)
        {
            fillingBoxes(boxes);
            if(boxes[100]=="True")
            {
                total++;
            }
            else if(boxes[100]=="")
            {
                i--;
            }
        }
        prob=total/100.0;
        System.out.println("Result of probability:%"+prob);
    }
    public static void fillingBoxes(String[] x)
    {
        for(int i=0;i<100;i++)
        {
            x[i]="WWBB";
        }
        x[100]="";
        throwingOperation(x);
    }
    public static void throwingOperation(String[] x)
    {
        Random r=new Random();
        int index=1;
        int rand;
        boolean b=true;
        boolean g=false;
        while(index!=0)
        {
            if(b)
            {
                rand=r.nextInt(x[index-1].length());
                if(x[index-1].charAt(rand)=='W')
                {
                    if(index==1)
                    {
                        g=true;
                    }
                    x[index-1]=x[index-1].replaceFirst("W","");
                    x[index]+='W';
                }
                else
                {
                    x[index-1]=x[index-1].replaceFirst("B","");
                    x[index]+='B';
                }
                index++;
            }
            else
            {
                rand=r.nextInt(x[index].length());
                if(x[index].charAt(rand)=='W')
                {
                    x[index]=x[index].replaceFirst("W","");
                    x[index-1]+='W';
                }
                else
                {
                    x[index]=x[index].replaceFirst("B","");
                    x[index-1]+='B';
                }
                index--;
            }
            if(index==100)
            {
                b=false;
                index--;
            }
        }
        if(x[0].charAt(r.nextInt(x[0].length()))=='W')
        {
            if(g)
            {
                x[100]="True";
            }
            else
            {
                x[100]="False";
            }
        }
    }
    public static void Display(String[] x)
    {
        for(int i=0;i<100;i++)
        {
            System.out.println(x[i]);
        }
    }
}
