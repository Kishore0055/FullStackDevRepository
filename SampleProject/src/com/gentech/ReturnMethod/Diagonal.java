package com.gentech.ReturnMethod;

class Diagonal 
{
    public short[] dE(short[][] array) 
    {
        short[] dE = new short[Math.min(array.length, array[0].length)];
        for (int i=0; i<dE.length;i++) 
        {
            dE[i] = array[i][i];
        }
        return dE;
    }
    public static void main(String[] args) 
    {
        short[][] array = 
        	{
                {11,22,33},
                {44,55,66},
                {77,88,99}
        };
        Diagonal diagonal = new Diagonal();
        short[] dE = diagonal.dE(array);
        System.out.print("Diagonal elements : ");
        for (short element : dE) 
        {
            System.out.print(element + " ");
        }
    }
}