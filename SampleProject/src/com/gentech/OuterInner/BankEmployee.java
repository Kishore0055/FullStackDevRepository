package com.gentech.OuterInner;

class OuterClass
{
	int employeeId;
	Inner3b inner3b=new Inner3b();
	Inner3a inner3a=new Inner3a();
	void showEmployeeId()
	{
		employeeId=101;
		System.out.println("Employee ID:"+employeeId);
	}
	void showEmployeeName()
	{
		inner3a.employeeName="Harsha";
		System.out.println("Employee Name:"+inner3a.employeeName);
	}
	void showDesignation()
	{
		inner3b.designation="Branch Manager";
		System.out.println("Designation:"+inner3b.designation);
	}
	private class Inner3a
	{
		String employeeName;
	}
	private class Inner3b
	{
		String designation;
	}
}
public class BankEmployee 
{
	public static void main(String[] args) 
	{
		OuterClass o3=new OuterClass();
		o3.showEmployeeId();
		o3.showEmployeeName();
		o3.showDesignation();
	}
}