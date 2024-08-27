package com.gentech.Programs;

class Employee 
{
    int empid;
    String empname;
}

class Department
{
    int deptid;
    String deptname;
}

class Insurance 
{
    String InsuranceName;
    String InsuranceType;
}

public class Office 
{
    public static void main(String[] args) 
    {
        Employee obj1 = new Employee();
        obj1.empname = "Santosh";
        obj1.empid = 101;
        System.out.println("Employee Name : " + obj1.empname);
        System.out.println("Employee Id : " + obj1.empid);
        System.out.println("------------------------------");

        Department obj2 = new Department();
        obj2.deptname = "Testing";
        obj2.deptid = 12;
        System.out.println("Department Name : " + obj2.deptname);
        System.out.println("Department Id : " + obj2.deptid);
        System.out.println("------------------------------");

        Insurance obj3 = new Insurance();
        obj3.InsuranceName = "Jnana Path";
        obj3.InsuranceType = "Education Policy";
        System.out.println("Insurance Name : " + obj3.InsuranceName);
        System.out.println("Insurance Type : " + obj3.InsuranceType);
        System.out.println("------------------------------");
    }
}