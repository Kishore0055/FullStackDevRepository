package com.gentech.abstract0;

abstract class University
{
	final String UnivName;
	final int univId;
	final String location;

	public University() 
	{
		UnivName="GENTECH";
		System.out.println("University Name :"+UnivName);
		univId=2001;
		System.out.println("University Id :"+univId);
		location="BANGALORE";
		System.out.println("Location :"+location);
	}
}
class EngineeringCollege extends University
{

}
public class AbstractInstance 
{
	public static void main(String[] args) 
	{
		EngineeringCollege ob1=new EngineeringCollege();
		EngineeringCollege ob2=new EngineeringCollege();
	}
}