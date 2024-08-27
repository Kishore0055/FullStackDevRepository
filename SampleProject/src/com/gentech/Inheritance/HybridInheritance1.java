package com.gentech.Inheritance;

class SalaryCalculator 
{
	int basicSalary;
	int allowance;
	int tax;
	int insurance;

	public SalaryCalculator(int basicSalary, int allowance, int tax, int insurance) 
	{
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		this.tax = tax;
		this.insurance = insurance;
	}
	public int calculateTotalSalary() 
	{
		return basicSalary + allowance;
	}
	public int calculateTotalDeductions() 
	{
		return tax + insurance;
	}
	public int calculateNetSalary() 
	{
		return calculateTotalSalary() - calculateTotalDeductions();
	}
}
class EmployeesSalary extends SalaryCalculator {
	public EmployeesSalary(int basicSalary, int allowance, int tax, int insurance) {
		super(basicSalary, allowance, tax, insurance);
	}

	public void displaySalaryDetails() 
	{
		System.out.println("Total Salary: " + calculateTotalSalary());
		System.out.println("Net Salary: " + calculateNetSalary());
	}
}
class EmployeesDeductions extends SalaryCalculator 
{
	public EmployeesDeductions(int basicSalary, int allowance, int tax, int insurance) 
	{
		super(basicSalary, allowance, tax, insurance);
	}

	public void displayDeductionDetails() 
	{
		System.out.println("Total Deductions: " + calculateTotalDeductions());
	}
}
class EmployeesDetails extends EmployeesSalary 
{
	EmployeesDeductions ed;

	public EmployeesDetails(int basicSalary, int allowance, int tax, int insurance) 
	{
		super(basicSalary, allowance, tax, insurance);
		ed = new EmployeesDeductions(basicSalary, allowance, tax, insurance);
	}
	public void displayEmployeesDetails() 
	{
		displaySalaryDetails();
		ed.displayDeductionDetails();
	}
}
public class HybridInheritance1 
{
	public static void main(String[] args) 
	{
		EmployeesDetails ed = new EmployeesDetails(75000, 17000, 3500, 2000);
		ed.displayEmployeesDetails();
	}
}