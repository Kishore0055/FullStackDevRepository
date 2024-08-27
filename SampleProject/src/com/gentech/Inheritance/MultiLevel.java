package com.gentech.Inheritance;

class Maths1
{
	void Addition(int a,int b)
	{
		System.out.println("Addition Result :"+(a+b));
	}
}
class Maths2 extends Maths1
{
	void Substraction(int c,int d)
	{
		System.out.println("Substraction Result :"+(c-d));
	}
}
class Maths3 extends Maths2
{
	void Division(int e,int f)
	{
		System.out.println("Division Result :"+(e/f));
	}
}
public class MultiLevel 
{
	public static void main(String[] args) 
	{
		Maths3 o=new Maths3();
		o.Addition(30, 50);
		o.Substraction(125, 90);
		o.Division(49, 7);
	}
}
