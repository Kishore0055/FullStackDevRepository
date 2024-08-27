package com.gentech.ReturnMethod;

class ArrayDemo 
{
    int[] getFirstHalf(int[] arr) 
    {
        int halfLength = arr.length / 2;
        int[] firstHalf = new int[halfLength];
        for (int i = 0; i < halfLength; i++) 
        {
            firstHalf[i] = arr[i];
        }
        return firstHalf;
    }
    int getSum(int[] arr) 
    {
        int sum = 0;
        for (int num : arr) 
        {
            sum += num;
        }
        return sum;
    }
}
public class IntArray 
{
    public static void main(String[] args) 
    {
        ArrayDemo arrayDemo = new ArrayDemo();
        int[] arr = {11,22,33,44,55,66,77,88,99,110};
        int[] firstHalf = arrayDemo.getFirstHalf(arr);
        System.out.print("First half of the array: ");
        for (int num : firstHalf) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
        int sum = arrayDemo.getSum(arr);
        System.out.print("Sum of all elements: " + sum);
    }
}

 
