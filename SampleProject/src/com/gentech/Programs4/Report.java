package com.gentech.Programs4;

class  ReportGeneration
{
	ReportGeneration(String paymenttype)
	{	
		System.out.println("Type of Sales: " + paymenttype);
	}
	ReportGeneration(int orderId)
	{
		System.out.println("Order Id: " + orderId);
	}
	ReportGeneration(double amount) 
	{
		System.out.println("Amount: " + amount);
	}
}
public class Report
{
	public static void main(String[] args)
	{
		ReportGeneration o2 = new ReportGeneration("Online");
		ReportGeneration o3 = new ReportGeneration(201);
		ReportGeneration o4 = new ReportGeneration(23627.00);
	}
}

