package polymorphism;

abstract class Vehicles 
{
	abstract void move();
}
class Cars extends Vehicles 
{
	public void move() 
	{
		System.out.println("Driving a Toyota Camry");
	}
}
class Bikes extends Vehicles 
{
	public void move() 
	{
		System.out.println("Riding a Harley Davidson");
	}
}
class Boats extends Vehicles 
{
	public void move() 
	{
		System.out.println("Sailing a Luxury Yacht");
	}
}
public class VehicleDemo 
{
	public static void main(String[] args) 
	{
		Vehicles car = new Cars();
		car.move();

		Vehicles bike = new Bikes();
		bike.move();

		Vehicles boat = new Boats();
		boat.move();
	}
}

