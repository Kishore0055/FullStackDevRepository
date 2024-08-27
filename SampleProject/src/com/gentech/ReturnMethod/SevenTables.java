package com.gentech.ReturnMethod;

class SevenTables 
{
    public static void main(String[] args) 
    {
        String[] table = SevenTableInReverse();
        for (String row : table) 
        {
            System.out.println(row);
        }
    }
    public static String[] SevenTableInReverse() 
    {
        String[] table = new String[10];
        for (int i = 10; i >= 1; i--) 
        {
            table[10 - i] = "7*" + i + "=" + 7 * i;
        }
        return table;
    }
}
