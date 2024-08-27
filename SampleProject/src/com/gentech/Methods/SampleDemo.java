package com.gentech.Methods;

public class SampleDemo 
{
    public static void main(String[] args) 
    {
        Sum o1 = new Sum();
        o1.addition();
    }
}

class Sum 
{
    void addition() 
    {
        int sum = 0;
        for (int i = 1; i <=50; i++) 
        {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
