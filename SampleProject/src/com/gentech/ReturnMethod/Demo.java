package com.gentech.ReturnMethod;
class sampledemo
{
	String getcityname(String str)
	{
		return str;
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		sampledemo o=new sampledemo();
		String s=o.getcityname("Bangalore");
		System.out.println(s);
	}

}
