package com.gentech.Inheritance;

class Employees1 
{
	String empName;
	int empAge;
	public Employees1(String name, int age) 
	{
		empName = name;
		empAge = age;
	}
}
class Manager1 extends Employees1 
{
	String dept;
	int exp;
	public Manager1(String name, int age, String department, int experience) 
	{
		super(name, age);
		dept = department;
		exp = experience;
	}
}
class TeamLead1 extends Manager1 
{
	int size;
	String project;
	public TeamLead1(String name, int age, String department, int experience, int teamSize, String projectName) 
	{
		super(name, age, department, experience);
		size = teamSize;
		project = projectName;
	}
}
public class MultiLevelInheritance1 
{
	public static void main(String[] args) 
	{
		TeamLead1 teamLead = new TeamLead1("Marques Lee", 35, "IT", 10, 5, "Project K");
		Manager1 manager = new Manager1("Arun Maini", 28, "BT", 10);

		System.out.println("Employee Name: " + teamLead.empName);
		System.out.println("Employee Age: " + teamLead.empAge);
		System.out.println("Department: " + teamLead.dept);
		System.out.println("Experience: " + teamLead.exp + " years");
		System.out.println("Team Size: " + teamLead.size);
		System.out.println("Project Name: " + teamLead.project);
		System.out.println("_______________________________________");

		System.out.println("Manager Name: " + manager.empName);
		System.out.println("Manager Age: " + manager.empAge);
		System.out.println("Manager Department: " + manager.dept);
		System.out.println("Manager Experience: " + manager.exp + " years");
	}
}