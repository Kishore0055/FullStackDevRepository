package com.gentech.Programs3;

class TwoWheeler 
{
    String ManufacturerName;
    String ModelName;
    TwoWheeler(String manufacturer, String model)
    {
        ManufacturerName = manufacturer;
        ModelName = model;
        System.out.println("ModelName : " + ModelName);
        System.out.println("ManufacturerName : " + ManufacturerName);
        System.out.println("_____________________________________________________");
    }
}

class FourWheeler 
{
    String ManufacturerName;
    String ModelName;
    FourWheeler(String manufacturer, String model)
    {
        ManufacturerName = manufacturer;
        ModelName = model;
        System.out.println("ModelName : " + ModelName);
        System.out.println("ManufacturerName : " + ManufacturerName);
        System.out.println("------------------------------");
    }
}

class HMV 
{
    String ManufacturerName;
    String ModelName;
    HMV(String manufacturer, String model)
    {
        ManufacturerName = manufacturer;
        ModelName = model;
        System.out.println("ModelName : " + ModelName);
        System.out.println("ManufacturerName : " + ManufacturerName);
        System.out.println("______________________________________________________");
    }
}
public class Vehicles 
{
    public static void main(String[] args) 
    {
        TwoWheeler obj1 = new TwoWheeler("Hero", "Splender");

        FourWheeler obj2 = new FourWheeler("Kia", "Seltos");

        HMV obj3 = new HMV("Volvo", "Canter");
        
    }
}