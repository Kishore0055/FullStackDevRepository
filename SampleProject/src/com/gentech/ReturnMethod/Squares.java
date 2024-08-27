package com.gentech.ReturnMethod;

class SquareOperations 
{
    int[] getSquares() 
    {
        int[] squares = new int[10];
        for (int i = 0; i < 10; i++) 
        {
            squares[i] = (i + 1) * (i + 1);
        }
        return squares;
    }
}
public class Squares 
{
    public static void main(String[] args) 
    {
        SquareOperations squareOps = new SquareOperations();
        int[] squares = squareOps.getSquares();
        System.out.print("Squares of numbers from 1 to 10: ");
        for (int num : squares) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
