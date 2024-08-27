package string;

class Employee 
{
	String firstName;
	String jobName;

	Employee(String firstName, String jobName) 
	{
		this.firstName = firstName;
		this.jobName = jobName;
	}
	@Override
	public String toString() 
	{
		return "Name of employee: " + firstName + " and job is: " + jobName;
	}
}
public class stringdemo 
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee("Santosh", "Doctor");
		System.out.println(obj.toString()); 
	}
}