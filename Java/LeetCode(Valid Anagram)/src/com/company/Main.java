package com.company;

public class Main {

    public static void main(String[] args)
    {
        String s1="yasa";
        String s2="asya";
        boolean b=false;
        char[] str1=s1.toCharArray();
        char[] str2=s2.toCharArray();
        char c;
        for(int i=0;i<s1.length()-1;i++)
        {
            for(int j=0;j<s1.length()-1-i;j++)
            {
               if(str1[j]>str1[j+1])
               {
                   c=str1[j];
                   str1[j]=str1[j+1];
                   str1[j+1]=c;
               }
               if(str2[j]>str2[j+1])
               {
                   c=str2[j];
                   str2[j]=str2[j+1];
                   str2[j+1]=c;
               }
            }
        }
        //s1=str1.toString();//Buradaki satır ile alttakinin farkı burada s1 içine str1 adlı nesnenin sınıfının adının sonuna
        //@ konur ve devamına nesnenin hash kodunu ekler.
        s1=String.valueOf(str1);//Burada direk olarak str1 adlı karakter dizisini Stringe çevirir.
        s2=String.valueOf(str2);
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2))b=true;
        System.out.println(b);
    }
}
