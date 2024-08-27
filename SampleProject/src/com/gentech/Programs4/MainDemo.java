package com.gentech.Programs4;

class Products1 
{
    Products1(String name) 
    {
        System.out.println("Name : "+name);
    }
    
    Products1(double Price) 
    {
        System.out.println("Price : "+Price);
    }
}

public class MainDemo 
{
    public static void main(String[] args) 
    {
        Products1 o1 = new Products1("Rabbit");
        Products1 o2 = new Products1(10000.99);   
    }	
}