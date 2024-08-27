package com.gentech.Programs3;

class Country 
{
    String countryName;
    String countryCode;
    String capital;
    Country(String name, String code, String cap)
    {
        countryName = name;
        countryCode = code;
        capital = cap;
        System.out.println("Country : " + countryName);
        System.out.println("Country Code : " + countryCode);
        System.out.println("Capital : " + capital);
        System.out.println("____________________________________________________________");
    }
}
class State 
{
    String stateName;
    String stateCode;
    String capital;
    State(String name, String code, String cap)
    {
        stateName = name;
        stateCode = code;
        capital = cap;
        System.out.println("State : " + stateName);
        System.out.println("State Code : " + stateCode);
        System.out.println("Capital : " + capital);
        System.out.println("_________________________________________________________");

    }
}
class District 
{
    String districtName;
    String districtCode;
    String headquarter;
    District(String name, String code, String head)
    {
        districtName = name;
        districtCode = code;
        headquarter = head;
        System.out.println("District : " + districtName);
        System.out.println("District Code : " + districtCode);
        System.out.println("Headquarter : " + headquarter);
        System.out.println("________________________________________________________");
    }
}
class Village 
{
    String villageName;
    String villageCode;
    int population;
    Village(String name, String code, int pop)
    {
        villageName = name;
        villageCode = code;
        population = pop;
        System.out.println("Village : " + villageName);
        System.out.println("Village Code : " + villageCode);
        System.out.println("Population : " + population);
        System.out.println("_____________________________________________________");
    }
}
public class Location 
{
    public static void main(String[] args) 
    {
        Country obj1 = new Country("India", "IN", "New Delhi");

        State obj2 = new State("Karnataka", "KA", "Bengaluru");
        
        District obj3 = new District("Bangalore", "BLR", "Bangalore");
        
        Village obj4 = new Village("Electronic City", "EC", 10000);
        
    }
}