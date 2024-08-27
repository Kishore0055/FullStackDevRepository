package com.gentech.Programs2;

class TwoWheeler 
{
    String ManufacturerName;
    String ModelName;
    TwoWheeler()
    {
    	ManufacturerName = "Yamaha";
        ModelName = "FZ";
        System.out.println("ModelName : " + ModelName);
        System.out.println("ManufacturerName : " + ManufacturerName);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}

class FourWheeler 
{
    String ManufacturerName;
    String ModelName;
    FourWheeler()
    {
    	ManufacturerName = "Toyota";
        ModelName = "Innova";
        System.out.println("ModelName : " + ModelName);
        System.out.println("ManufacturerName : " + ManufacturerName);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class HMV 
{
    String ManufacturerName;
    String ModelName;
    HMV()
    {
    	ManufacturerName = "Tata";
        ModelName = "EV6";
        System.out.println("ModelName : " + ModelName);
        System.out.println("ManufacturerName : " + ManufacturerName);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

public class Vehicles 
{
    public static void main(String[] args) 
    {
        TwoWheeler obj1 = new TwoWheeler();

        FourWheeler obj2 = new FourWheeler();

        HMV obj3 = new HMV();
        
    }
}