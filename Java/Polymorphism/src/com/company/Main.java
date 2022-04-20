package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Car car=new Car("Standart","Fiat","Doblo","Gray",new Engine(4,95));
        DriftCar drt=new DriftCar("Nissan","Silvia S-15","Gray",new Engine(4,247,"SR20DET"));
        DriftCar drt2=new DriftCar("Nissan","350Z","Orange",new Engine(6,313,"VQ35DETT"));
        DragCar  drg=new DragCar("Dodge","Charger R/T 70","Black",new Engine(8,425));
        technicalSpecs(car);
        technicalSpecs(drt);
        technicalSpecs(drt2);
        technicalSpecs(drg);
        tell(car);
        tell(drt);
        tell(drt2);
        tell(drg);
    }
    public static void technicalSpecs(Car c)//Polymorphism
    {
        c.technicalSpecs();
    }
    public static void tell(Car c)//Polymorphism
    {
        c.tell();
    }
}
