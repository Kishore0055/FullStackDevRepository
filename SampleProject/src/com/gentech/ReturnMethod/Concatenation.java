package com.gentech.ReturnMethod;

class Concatenation 
{
    public String concatenateStrings(String[] array) 
    {
        String concatenatedString = "";
        for (String str : array) 
        {
            concatenatedString += str;
        }
        return concatenatedString;
    }
    public static void main(String[] args) {
        Concatenation sc = new Concatenation();
        String[] array = {"Hello", "World", "Java"};
        String result = sc.concatenateStrings(array);
        System.out.println("Concatenated string: " + result);
    }
}
