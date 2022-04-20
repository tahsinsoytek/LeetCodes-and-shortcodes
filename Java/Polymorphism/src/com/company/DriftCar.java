package com.company;

public class DriftCar extends Car
{
    public DriftCar(String brand,String model,String color,Engine engine)
    {
        super("Drift Tires",brand,model,color,engine);
    }
    public void tell()
    {
        System.out.println("I am a drift car and my brand is:"+getBrand()+" and my model is:"+getModel());
    }
}
