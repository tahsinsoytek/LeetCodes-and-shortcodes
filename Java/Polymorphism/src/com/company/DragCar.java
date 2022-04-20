package com.company;

public class DragCar extends Car
{
    public DragCar(String brand,String model,String color,Engine engine)
    {
        super("Drag Tires",brand,model,color,engine);
    }
    public void tell()
    {
        System.out.println("I am a drag car and my brand is:"+getBrand()+" and my model is:"+getModel());
    }
}
