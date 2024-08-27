package com.gentech.ReturnMethod;

class FirstRow 
{
    public static void main(String[] args) 
    {
        char[][] array = {{'z','x','w'},{'y','v','u'},{'l','m','n'}};
        char[] firstRow = getFirstRow(array);
        System.out.print("First row: ");
        for (char c : firstRow) 
        {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static char[] getFirstRow(char[][] array) 
    {
        if (array == null || array.length == 0) 
        {
            return new char[0]; 
        }
        return array[0];
    }
}
