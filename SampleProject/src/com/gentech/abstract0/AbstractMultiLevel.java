package com.gentech.abstract0;

abstract class Institution
{
	String institutionName;
	abstract void getInstitutionName(String institutionName);
	Institution(String institutionName)
	{
		this.institutionName=institutionName;
		System.out.println("Institution name :"+this.institutionName);
	}
}
class Learner extends Institution
{
	int learnerAge;
	String learnerName;
	void getInstitutionName(String institutionName)
	{
		System.out.println("Institution name :"+institutionName);
	}
	Learner(String learnerName,int learnerAge)
	{
		super("GENTECH");
		this.learnerAge=learnerAge;
		this.learnerName=learnerName;
		System.out.println("Learner name :"+this.learnerName);
		System.out.println("Learner age :"+learnerAge);
	}
}
class ResourceCenter extends Learner
{
	String resourceName;
	int resourceId;
	ResourceCenter(String learnerName,int learnerAge,String resourceName,int resourceId)
	{
		super(learnerName,learnerAge);
		this.resourceId=resourceId;
		this.resourceName=resourceName;
		System.out.println("Resource name :"+this.resourceName);
		System.out.println("Resource id :"+this.resourceId);
	}
}
public class AbstractMultiLevel 
{
	public static void main(String[] args) 
	{
		ResourceCenter obj=new ResourceCenter("Rahul",23,"design",1001);
		obj.getInstitutionName("GENTECH");
	}
}