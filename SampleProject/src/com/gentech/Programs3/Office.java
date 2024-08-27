package com.gentech.Programs3;

class Employee 
{
    int empid;
    String empname;
    Employee(int id, String name)
    {
        empid = id;
        empname = name;
        System.out.println("Employee Name : " + empname);
        System.out.println("Employee Id : " + empid);
        System.out.println("_______________________________________________________");
    }
}
class Department
{
    int deptid;
    String deptname;
    Department(int id, String name)
    {
        deptid = id;
        deptname = name;
        System.out.println("Department Name : " + deptname);
        System.out.println("Department Id : " + deptid);
        System.out.println("______________________________________________________________");
    }
}
class Insurance 
{
    String InsuranceName;
    String InsuranceType;
    Insurance(String name, String type)
    {
        InsuranceName = name;
        InsuranceType = type;
        System.out.println("Insurance Name : " + InsuranceName);
        System.out.println("Insurance Type : " + InsuranceType);
        System.out.println("___________________________________________________________");
    }
}

public class Office 
{
    public static void main(String[] args) 
    {
        Employee obj1 = new Employee(101, "Santosh");
        Department obj2 = new Department(12, "Testing");     
        Insurance obj3 = new Insurance("Jnana Path", "Education Policy");
       
    }
}