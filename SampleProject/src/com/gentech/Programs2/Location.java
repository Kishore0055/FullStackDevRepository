package com.gentech.Programs2;

class Country 
{
    String countryName;
    String countryCode;
    String capital;
    Country()
    {
    	countryName = "India";
        countryCode = "IN";
        capital = "New Delhi";
        System.out.println("Country : " + countryName);
        System.out.println("Country Code : " + countryCode);
        System.out.println("Capital : " + capital);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}

class State 
{
    String stateName;
    String stateCode;
    String capital;
    State()
    {
    	stateName = "Karnataka";
        stateCode = "KA";
        capital = "Bengaluru";
        System.out.println("State : " + stateName);
        System.out.println("State Code : " + stateCode);
        System.out.println("Capital : " + capital);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}

class District 
{
    String districtName;
    String districtCode;
    String headquarter;
    District()
    {
    	districtName = "Bangalore";
        districtCode = "BLR";
        headquarter = "Bangalore";
        System.out.println("District : " + districtName);
        System.out.println("District Code : " + districtCode);
        System.out.println("Headquarter : " + headquarter);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Village 
{
    String villageName;
    String villageCode;
    int population;
    Village()
    {
    	villageName = "Electronic City";
        villageCode = "EC";
        population = 10000;
        System.out.println("Village : " + villageName);
        System.out.println("Village Code : " + villageCode);
        System.out.println("Population : " + population);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}

public class Location 
{
    public static void main(String[] args) 
    {
        Country obj1 = new Country();

        State obj2 = new State();
        
        District obj3 = new District();
        
        Village obj4 = new Village();
        
    }
}