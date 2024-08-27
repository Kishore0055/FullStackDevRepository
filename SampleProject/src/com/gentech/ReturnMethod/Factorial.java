package com.gentech.ReturnMethod;

class MathOperations 
{
    long getFactorial(int n) 
    {
        long fact = 1;
        for (int i = 2; i <= n; i++) 
        {
            fact *= i;
        }
        return fact;
    }
}
public class Factorial 
{
    public static void main(String[] args) 
    {
        MathOperations mathOps = new MathOperations();
        int num = 11;
        long factorial = mathOps.getFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
