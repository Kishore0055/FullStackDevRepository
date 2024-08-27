package com.gentech.ReturnMethod;

class Tables 
{
    public String getTable(int number) 
    {
        String table = "";
        for (int i = 1; i <= 10; i++) 
        {
            table += number + " * " + i + " = " + number * i + "\n";
        }
        return table;
    }
    public static void main(String[] args) 
    {
        Tables tables = new Tables();
        for (int i = 1; i <= 20; i++) 
        {
            System.out.println("Table of " + i + ":");
            System.out.println(tables.getTable(i));
            System.out.println();
        }
    }
}