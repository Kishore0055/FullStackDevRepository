package com.gentech.abstract0;

abstract class Institutions
{
	static String institutionName;
	static int institutionId;
	static String institutionAddress;

	static
	{
		institutionName = "GENTECH";
		System.out.println("Institution Name :" + institutionName);
		institutionId = 2001;
		System.out.println("Institution Id :" + institutionId);
		institutionAddress = "MANDYA";
		System.out.println("Institution Address :" + institutionAddress);
	}

	static void displayInstitutionInfo()
	{
		System.out.println("Displaying Institution Information...");
	}
}

class SubInstitutions extends Institutions
{
}

public class AbstractStatic2 
{
	public static void main(String[] args)
	{
		SubInstitutions obj1 = new SubInstitutions();
		Institutions.displayInstitutionInfo();
	}
}