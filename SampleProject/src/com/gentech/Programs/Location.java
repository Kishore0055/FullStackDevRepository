package com.gentech.Programs;

class Country {
    String countryName;
    String countryCode;
    String capital;
}

class State {
    String stateName;
    String stateCode;
    String capital;
}

class District {
    String districtName;
    String districtCode;
    String headquarter;
}

class Village {
    String villageName;
    String villageCode;
    int population;
}

public class Location {
    public static void main(String[] args) {
        Country obj1 = new Country();
        obj1.countryName = "India";
        obj1.countryCode = "IN";
        obj1.capital = "New Delhi";
        System.out.println("Country : " + obj1.countryName);
        System.out.println("Country Code : " + obj1.countryCode);
        System.out.println("Capital : " + obj1.capital);
        System.out.println("------------------------------");

        State obj2 = new State();
        obj2.stateName = "Karnataka";
        obj2.stateCode = "KA";
        obj2.capital = "Bengaluru";
        System.out.println("State : " + obj2.stateName);
        System.out.println("State Code : " + obj2.stateCode);
        System.out.println("Capital : " + obj2.capital);
        System.out.println("------------------------------");

        District obj3 = new District();
        obj3.districtName = "Bangalore";
        obj3.districtCode = "BLR";
        obj3.headquarter = "Bangalore";
        System.out.println("District : " + obj3.districtName);
        System.out.println("District Code : " + obj3.districtCode);
        System.out.println("Headquarter : " + obj3.headquarter);
        System.out.println("------------------------------");

        Village obj4 = new Village();
        obj4.villageName = "Electronic City";
        obj4.villageCode = "EC";
        obj4.population = 10000;
        System.out.println("Village : " + obj4.villageName);
        System.out.println("Village Code : " + obj4.villageCode);
        System.out.println("Population : " + obj4.population);
        System.out.println("------------------------------");
    }
}