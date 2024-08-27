package com.gentech.Programs4;

class DevelopmentDemo
{
	DevelopmentDemo(String softwareName)
	{
		System.out.println("Software Name: " + softwareName);
	}

	DevelopmentDemo(int softwareId)
	{
		System.out.println("Software Id: " + softwareId);
	}

	DevelopmentDemo(double percentageCompleted)
	{
		System.out.println("Percenatge of Software Completed: " + percentageCompleted);
	}
}
public class Software
{
	public static void main(String[] args)
	{
		DevelopmentDemo o1 = new DevelopmentDemo("Instagram");
		DevelopmentDemo o2 = new DevelopmentDemo(101);
		DevelopmentDemo o3 = new DevelopmentDemo(35.78);
	}

}

