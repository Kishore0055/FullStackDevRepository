package com.gentech.Inheritance;

class Employee 
{
	void EmployeeInfo(String name, int age) 
	{
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Age: " + age);
	}
}
class Manager extends Employee 
{
	void ManagerInfo(String department, int experience) 
	{
		System.out.println("Department: " + department);
		System.out.println("Experience: " + experience + " years");
	}
}
class TeamLead extends Manager 
{
	void TeamLeadInfo(int teamSize, String projectName) 
	{
		System.out.println("Team Size: " + teamSize);
		System.out.println("Project Name: " + projectName);
	}
}
public class MultiLevelInheritance 
{
	public static void main(String[] args) 
	{
		TeamLead teamLead = new TeamLead();
		teamLead.EmployeeInfo("Arun Maini", 35);
		teamLead.ManagerInfo("IT", 10);
		teamLead.TeamLeadInfo(5, "Project K");
	}
}
