package com.gentech.OuterInner;

class Outer4
{
    String city;
    void showTemperature()
    {
        Inner4a inner4a=new Inner4a();
        inner4a.temperature=25;
        System.out.println("Temperature = "+inner4a.temperature+"°C");
    }
    void showHumidity()
    {
        Inner4b inner4b=new Inner4b();
        inner4b.humidity=60;
        System.out.println("Humidity = "+inner4b.humidity+"%");
    }

    static class Inner4a
    {
        int temperature;
    }
    static class Inner4b
    {
        int humidity;
    }
    void showCity()
    {
        city="Tumkur";
        System.out.println("City: "+city);
    }
}   
public class TwoStaticInner 
{
	 public static void main(String[] args) {
	        Outer4 o4=new Outer4();
	        o4.showCity();
	        o4.showTemperature();
	        o4.showHumidity();
	    }

	}
