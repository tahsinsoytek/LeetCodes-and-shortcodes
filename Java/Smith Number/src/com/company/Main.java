package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int x,j,numberOfDigits,sum,number;
        System.out.println("Enter a number:");
        x=input.nextInt();
        number=x;
        j=10;
        numberOfDigits=1;
        while(x>=j)
        {
            j*=10;
            numberOfDigits++;
        }
        //System.out.println(numberOfDigits);
        sum=0;
        for(int i=1;i<=numberOfDigits;i++)
        {
            sum+=x%10;
            x/=10;
        }
        //System.out.println(sum);
        if(primeFactors(number)==sum)
            System.out.println(number+" is a Smith Number");
        else
            System.out.println(number+" is not a Smith Number");
    }
    public static int primeFactors(int a)
    {
        int number,number2,number3;
        int sum=0;
        boolean b;
        int numberOfDigits=1;
        int z;
        number3=a;
        for(int i=2;i<=a/2;i++)
        {
            b=true;
            for(int j=2;j<=i/2&&b;j++)
            {
                if(i%j==0)
                {
                    b=false;
                }
            }
            if(b)
            {
                number=i;
                while(number3%number==0)
                {
                    z=10;
                    numberOfDigits=1;
                    while(number>=z)
                    {
                        z*=10;
                        numberOfDigits++;
                    }
                    number2=number;
                    for(int k=1;k<=numberOfDigits;k++)
                    {
                        sum+=number2%10;
                        number2/=10;
                    }
                    number3/=i;
                }
            }
    }
        return sum;


}
}