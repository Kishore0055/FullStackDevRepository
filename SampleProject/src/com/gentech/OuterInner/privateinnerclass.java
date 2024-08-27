package com.gentech.OuterInner;

class Outer 
{
	String customerName;
	private Inner inner = new Inner();
	void showCustomerID() 
	{
		inner.customerID = 101;
		System.out.println("Customer ID: " + inner.customerID);
	}
	public void showCustomerName() 
	{
		inner.showCustomerName();
	}
	private class Inner 
	{
		int customerID;
		void showCustomerName()
		{
			customerName = "Kishore"; 
			System.out.println("Customer Name: " + customerName);
		}
	}
}
public class privateinnerclass 
{
	public static void main(String[] args) 
	{
		Outer outer = new Outer();
		outer.showCustomerID();
		outer.showCustomerName();
	}
}