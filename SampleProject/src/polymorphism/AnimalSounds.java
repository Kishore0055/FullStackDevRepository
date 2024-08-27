package polymorphism;

abstract class Animal 
{
	abstract void sound();
}
class Dog extends Animal 
{
	void sound() 
	{
		System.out.println("Sound of Dog :Woof!");
	}
}
class Cat extends Animal {
	void sound() {
		System.out.println("Sound of Cat :Meow!");
	}
}
class Bird extends Animal 
{
	void sound() 
	{
		System.out.println("Sound of Bird :Chirp!");
	}
}
public class AnimalSounds 
{
	public static void main(String[] args) 
	{
		Animal animal = null;

		animal = new Dog();
		animal.sound();

		animal = new Cat();
		animal.sound();

		animal = new Bird();
		animal.sound();
	}
}
