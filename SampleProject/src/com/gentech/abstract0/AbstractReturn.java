package com.gentech.abstract0;

class StaffInfo
{
	String staffName;
	double income;
	public StaffInfo(String staffName, double income) 
	{
		this.staffName = staffName;
		this.income = income;
	}
}
abstract class Staff
{
	abstract StaffInfo getInformation(String staffName,double income);
}
class StaffMember extends Staff
{
	StaffInfo getInformation(String staffName,double income)
	{
		return new StaffInfo(staffName, income);
	}

}
public class AbstractReturn 
{
	public static void main(String[] args) 
	{
		StaffMember obj1=new StaffMember();
		StaffInfo staffInfo = obj1.getInformation("John Doe", 75000);
		System.out.println("Staff Name: " + staffInfo.staffName + ", Income: " + staffInfo.income);
	}
}