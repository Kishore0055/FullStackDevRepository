package polymorphism;

abstract class Food 
{
	abstract String taste();
}
class SweetFood extends Food 
{
	String taste() 
	{
		return "Sweet";
	}
}
class SourFood extends Food 
{
	String taste() 
	{
		return "Sour";
	}
}
class SaltyFood extends Food 
{
	String taste() 
	{
		return "Salty";
	}
}
class BitterFood extends Food 
{
	String taste() 
	{
		return "Bitter";
	}
}
public class FoodTaste 
{
	public static void main(String[] args) 
	{
		Food apple = new SweetFood();
		Food lemon = new SourFood();
		Food chips = new SaltyFood();
		Food coffee = new BitterFood();

		System.out.println("Apple tastes " + apple.taste());
		System.out.println("Lemon tastes " + lemon.taste());
		System.out.println("Chips tastes " + chips.taste());
		System.out.println("Coffee tastes " + coffee.taste());
	}
}

