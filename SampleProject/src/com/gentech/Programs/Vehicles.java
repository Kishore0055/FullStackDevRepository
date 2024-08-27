package com.gentech.Programs;

class TwoWheeler {
    String ManufacturerName;
    String ModelName;
}

class FourWheeler {
    String ManufacturerName;
    String ModelName;
}

class HMV {
    String ManufacturerName;
    String ModelName;
}

public class Vehicles {
    public static void main(String[] args) {
        TwoWheeler obj1 = new TwoWheeler();
        obj1.ManufacturerName = "Hero";
        obj1.ModelName = "Splender";
        System.out.println("ModelName : " + obj1.ModelName);
        System.out.println("ManufacturerName : " + obj1.ManufacturerName);
        System.out.println("------------------------------");

        FourWheeler obj2 = new FourWheeler();
        obj2.ManufacturerName = "Kia";
        obj2.ModelName = "Seltos";
        System.out.println("ModelName : " + obj2.ModelName);
        System.out.println("ManufacturerName : " + obj2.ManufacturerName);
        System.out.println("------------------------------");

        HMV obj3 = new HMV();
        obj3.ManufacturerName = "Volvo";
        obj3.ModelName = "Canter";
        System.out.println("ModelName : " + obj3.ModelName);
        System.out.println("ManufacturerName : " + obj3.ManufacturerName);
        System.out.println("------------------------------");
    }
}