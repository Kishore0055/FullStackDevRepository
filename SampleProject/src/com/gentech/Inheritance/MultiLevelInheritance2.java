package com.gentech.Inheritance;

class Person 
{
	Person(String name, int age) 
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	Person(String name, int age, String address) 
	{
		this(name, age);
		System.out.println("Address: " + address);
	}
	Person(String name, int age, String address, String phoneNumber) 
	{
		this(name, age, address);
		System.out.println("Phone Number: " + phoneNumber);
	}
	Person(String name, int age, String address, String phoneNumber, String email) 
	{
		this(name, age, address, phoneNumber);
		System.out.println("Email: " + email);
	}
}
class Student extends Person 
{
	Student(String name, int age, String address, String phoneNumber, String email) 
	{
		super(name, age, address, phoneNumber, email);
	}
}
class Teacher extends Person 
{
	Teacher(String name, int age, String address, String phoneNumber, String email, String subject) 
	{
		super(name, age, address, phoneNumber, email);
		System.out.println("Subject: " + subject);
	}
}
public class MultiLevelInheritance2 
{
	public static void main(String[] args) 
	{
		Student student1 = new Student("Shlok", 20, "123 Main St", "123-456-7890", "shlok@example.com");
		System.out.println();
		Teacher teacher1 = new Teacher("Roopesh", 35, "456 Elm St", "987-654-3210", "roopesh@example.com", "Math");
		System.out.println();
		Student student2 = new Student("Kavya", 22, "789 Oak St", "555-123-4567", "kavya@example.com");
		System.out.println();
		Teacher teacher2 = new Teacher("Sarah", 40, "321 Maple St", "111-222-3333", "sarah.khan@example.com", "English");
	}
}


