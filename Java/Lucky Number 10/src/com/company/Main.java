package com.company;

import java.util.*;

public class Main {
//1den 60a kadar 1 milyon kere sayı üret
    //Bunları K V şeklinde mape aktar
    //Örneğin 30 sayısından 5 kere üretildiyse 30 key,5 ise value olur
    //Sonra bunları bir listeye aktar
    //Listedeki  değerlerin 10 tanesini(birbirinden farklı olan) sete aktar.İlk 10 değeri aktar.
    static HashMap<Integer,Integer> numbersMap;
    static ArrayList<Integer> numbersList;
    static HashSet<Integer> numbersSet;
    static Random rand=new Random();

    public static void main(String[] args)
    {
        generateNumbersForMap();
        System.out.println(numbersSet);

    }
    public static void method()
    {
        int max,index;
        max=numbersMap.get(1);
        index=1;
        for(int i=1;i<=60;i++)
        {
            if(max<numbersMap.get(i))
            {
                max=numbersMap.get(i);
                index=i;
            }
        }
        System.out.println("Max value:"+max+" Index:"+index);
    }
    public static void method2()
    {
        for(int temp:numbersSet)
        {
            System.out.println(numbersMap.get(temp));
        }
    }

    public static void initializeMap()
    {
        numbersMap=new HashMap<>();
        for(int i=1;i<=60;i++)
        {
            numbersMap.put(i,0);
        }
    }
    public static void generateNumbersForMap()
    {
        initializeMap();
        int randomNumber;
        for(int i=0;i<1000000;i++)
        {
            randomNumber=rand.nextInt(60)+1;
            numbersMap.put(randomNumber,numbersMap.get(randomNumber)+1);
        }
        addingToList();
    }
    public static void addingToList()
    {
        numbersList=new ArrayList<>();
        for(int i=1;i<=60;i++)
        {
            for(int j=0;j<numbersMap.get(i);j++)
            {
                numbersList.add(i);
            }
        }
        addingToSet();
    }
    public static void addingToSet()
    {
        int control;
        numbersSet=new HashSet<>();
        boolean b;
        for(int i=0;i<10;i++)
        {
            control=numbersSet.size();
            b=true;
            while(b)
            {
                numbersSet.add(numbersList.get(rand.nextInt(1000000)));
                if(numbersSet.size()-control==1)
                {
                    b=false;
                }
            }
        }
    }

}
