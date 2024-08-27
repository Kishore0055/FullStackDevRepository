package com.gentech.Methods;

public class MainDemo 
{
    public static void main(String[] args) 
    {
        CountNumber counter = new CountNumber();
        counter.count1();
    }
}

class CountNumber 
{
    void count1() 
    {
        int count = 0;
        for (int i = 50; i <= 150; i++) 
        {
            if (i % 6 == 0) 
            {
                count = count + 1;
            }
        }
        System.out.println("Count of numbers divisible by 6: " + count);
    }
}