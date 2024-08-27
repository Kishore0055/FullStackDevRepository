package com.gentech.Methods;

public class DEMO 
{
    public static void main(String[] args) 
    {
        ReverseArray o1 = new ReverseArray();
        o1.reverse(new String[]{"Ram", "Sam"});
    }
}

class ReverseArray
{
    void reverse(String a[])
    {
        for (int i = a.length - 1; i >= 0; i--) 
        {
            System.out.println(a[i]);
        }
    }
}