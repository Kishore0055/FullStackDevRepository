package com.gentech.Programs4;

class User 
{
	User(String name, int age) 
	{
		System.out.println("Name: " + name + ", Age: " + age);
	}
	User(String name, String email) 
	{
		System.out.println("Name: " + name + ", Email: " + email);
	}

	User(String name, int age, String email) 
	{
		System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
	}
}
public class UserProfile  
{
	public static void main(String[] args) 
	{
		System.out.println("User profiles:");
		new User("Janardhan", 25);
		new User("Janardhan", "Janardhan.@example.com");
		new User("Bhavya", 40, "bhavya@example.com");
	}
}