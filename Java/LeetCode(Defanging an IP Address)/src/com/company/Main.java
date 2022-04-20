package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String ipAddress;
        System.out.println("Enter the IP Address:");
        ipAddress=input.next();
        String[] parts=ipAddress.split("[.]");
        ipAddress="";
        for(int i=0;i<parts.length;i++)
        {
            if(i!=parts.length-1)
            {
                 ipAddress+=parts[i]+"[.]";
            }
            else
            {
                 ipAddress+=parts[i];
            }


        }
        System.out.println(ipAddress);
    }
    }

