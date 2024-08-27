package com.gentech.OuterInner;

class Outer2
{
	double radius;
	InnerStatic2 o = new InnerStatic2();
	void setRadius(double radius)
	{
		this.radius = radius;
		o.pi = 3.1415;
	}

	static class InnerStatic2
	{
		double pi;
	}
	double calculateArea()
	{
		return o.pi * radius * radius;
	}
	void displayArea()
	{
		double area = calculateArea();
		System.out.println("Area of the circle: " + area);
	}
}
public class StaticInnerClass 
{
	public static void main(String[] args)
	{
		Outer2 obj = new Outer2();
		obj.setRadius(5.0);
		obj.displayArea();
	}
}

