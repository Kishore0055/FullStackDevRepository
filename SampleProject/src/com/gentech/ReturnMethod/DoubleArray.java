package com.gentech.ReturnMethod;

class ArrayOperations 
{
    double[] getReverse(double[] arr) 
    {
        double[] reversed = new double[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            reversed[index] = arr[i];
            index++;
        }
        return reversed;
    }
}
public class DoubleArray 
{
    public static void main(String[] args) 
    {
        ArrayOperations arrayOps = new ArrayOperations();
        double[] arr = new double[]{11.1,22.2,33.3,44.4,55.5,66.6,77.7,88.8,99.9,110.0};

        double[] reversed = arrayOps.getReverse(arr);
        System.out.print("Reversed array: ");
        for (double num : reversed) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
