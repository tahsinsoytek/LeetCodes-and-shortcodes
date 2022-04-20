package com.company;

public class Engine
{
    private int numberOfCylinders;
    private int horsePower;
    private String engineCode;
    public Engine(int numberOfCylinders,int horsePower,String engineCode)
    {
        this.numberOfCylinders=numberOfCylinders;
        this.horsePower=horsePower;
        this.engineCode=engineCode;
    }
    public Engine(int numberOfCylinders,int horsePower)
    {
        this.numberOfCylinders=numberOfCylinders;
        this.horsePower=horsePower;
        this.engineCode="Unknown";
    }
    public String featureList()
    {
        return "Number of cylinders:"+numberOfCylinders+" Horsepower:"+horsePower+" Engine Code:"+engineCode;
    }
}