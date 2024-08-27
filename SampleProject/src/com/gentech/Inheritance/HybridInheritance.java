package com.gentech.Inheritance;

class EmployeeSalary 
{
	void TotalSalary(int basicSalary, int allowance) 
	{
		System.out.println("Total Salary :" + (basicSalary + allowance));
	}
}
class EmployeeDeductions 
{
	void TotalDeductions(int tax, int insurance) 
	{
		System.out.println("Total Deductions :" + (tax + insurance));
	}
}
class EmployeeNetSalary extends EmployeeSalary 
{
	EmployeeDeductions ed = new EmployeeDeductions();

	void NetSalary(int basicSalary, int allowance, int tax, int insurance) 
	{
		TotalSalary(basicSalary, allowance);
		ed.TotalDeductions(tax, insurance);
		int netSalary = (basicSalary + allowance) - (tax + insurance);
		System.out.println("Net Salary :" + netSalary);
	}
	void TotalDeductions(int tax, int insurance) 
	{
		ed.TotalDeductions(tax, insurance);
	}
}  
public class HybridInheritance 
{
	public static void main(String[] args) 
	{
		EmployeeNetSalary ens = new EmployeeNetSalary();
		ens.NetSalary(50000, 10000, 5000, 2000);
	}
}

