package com.gentech.Inheritance;

class University 
{
	void UniversityName(String name) 
	{
		System.out.println("University Name: " + name);
	}
}
class EngineeringCollege extends University 
{
	void CollegeName(String name) 
	{
		System.out.println("College Name: " + name);
	}

	void Courses() 
	{
		System.out.println("Courses: B.Tech, M.Tech");
	}
}
class MedicalCollege extends University 
{
	void CollegeName(String name) 
	{
		System.out.println("College Name: " + name);
	}
	void Courses() 
	{
		System.out.println("Courses: MBBS, MD");
	}
}
class ArtsCollege extends University 
{
	void CollegeName(String name) 
	{
		System.out.println("College Name: " + name);
	}
	void Courses() 
	{
		System.out.println("Courses: BA, MA");
	}
}
public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		EngineeringCollege ec = new EngineeringCollege();
		ec.UniversityName("ABC University");
		ec.CollegeName("XYZ Engineering College");
		ec.Courses();
		System.out.println("_______________________________________");

		MedicalCollege mc = new MedicalCollege();
		mc.UniversityName("ABC University");
		mc.CollegeName("PQR Medical College");
		mc.Courses();
		System.out.println("_______________________________________");

		ArtsCollege ac = new ArtsCollege();
		ac.UniversityName("ABC University");
		ac.CollegeName("MNO Arts College");
		ac.Courses();
	}
}