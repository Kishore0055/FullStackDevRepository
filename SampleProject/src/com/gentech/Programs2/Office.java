package com.gentech.Programs2;

class Employee 
{
    int empid;
    String empname;
    Employee()
    {
    	empname = "Mahesh";
        empid = 11;
        System.out.println("Employee Name : " + empname);
        System.out.println("Employee Id : " + empid);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
class Department
{
    int deptid;
    String deptname;
    Department()
    {
    	deptname = "Devlopment";
        deptid = 103;
        System.out.println("Department Name : " + deptname);
        System.out.println("Department Id : " + deptid);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

    }
}
class Insurance 
{
    String InsuranceName;
    String InsuranceType;
    Insurance()
    {
    	 InsuranceName = "Forward Path";
         InsuranceType = "Education";
         System.out.println("Insurance Name : " + InsuranceName);
         System.out.println("Insurance Type : " + InsuranceType);
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

public class Office 
{
    public static void main(String[] args) 
    {
        Employee obj1 = new Employee();
        Department obj2 = new Department();     
        Insurance obj3 = new Insurance();
       
    }
}