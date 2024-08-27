package polymorphism;

interface Vehicle 
{
	void move();
}
class Car implements Vehicle 
{
	public void move() 
	{
		System.out.println("Driving-Car");
	}
}
class Bike implements Vehicle 
{
	public void move() 
	{
		System.out.println("Riding-Bike");
	}
}
class Boat implements Vehicle 
{
	public void move() 
	{
		System.out.println("Sailing-Boat");
	}
}
public class VehicleMovement 
{
	public static void main(String[] args) 
	{
		Vehicle car = new Car();
		car.move();

		Vehicle bike = new Bike();
		bike.move();

		Vehicle boat = new Boat();
		boat.move();
	}
}