package com.gentech.Programs4;

class ContractDemo 
{
	ContractDemo(String contractname)
	{
		System.out.println("Contract Name: " + contractname);
	} 

	ContractDemo(int contractId)
	{
		System.out.println("Contract Id: " + contractId);
	}

	ContractDemo(double contractAmount)
	{
		System.out.println("Contract Amount: " + contractAmount);
	}
}
public class Contract
{

	public static void main(String[] args)
	{
		ContractDemo o1 = new ContractDemo("Adithya Birla Group");
		ContractDemo o2 = new ContractDemo(101);
		ContractDemo o3 = new ContractDemo(256478.98);
	}

}

