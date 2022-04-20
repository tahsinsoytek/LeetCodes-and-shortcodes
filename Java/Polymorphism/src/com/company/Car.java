package com.company;

public class Car
{
    private String tires;
    private String brand;
    private String model;
    private String color;
    private Engine engine;

    public Car(String tires,String brand,String model,String color,Engine engine)
    {
        this.tires=tires;
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.engine=engine;
    }
    public String getModel()
    {
        return model;
    }
    public String getBrand()
    {
        return brand;
    }
    public void technicalSpecs()
    {
        System.out.println(engine.featureList());
    }
    public void tell()
    {
        System.out.println("I am just a car and my brand is:"+brand+" and my model is:"+model);
    }
}
