package com.gentech.ReturnMethod;

class ArrDemo 
{
    short[] getSecondHalf(short[] arr) 
    {
        int halfLength = arr.length / 2;
        int secondHalfLength = arr.length - halfLength;
        short[] secondHalf = new short[secondHalfLength];
        for (int i = 0; i < secondHalfLength; i++) 
        {
            secondHalf[i] = arr[halfLength + i];
        }
        return secondHalf;
    }
}
public class ShortArray 
{
    public static void main(String[] args) 
    {
        ArrDemo arrDemo = new ArrDemo();
        short[] arr = {11,22,33,44,55,66,77,88,99,110};
        short[] secondHalf = arrDemo.getSecondHalf(arr);
        System.out.print("Second half of the array: ");
        for (short num : secondHalf) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
