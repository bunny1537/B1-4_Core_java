package com.tns.abstrac;
abstract class animal
{
	abstract void eat();
}
class Herbivorous extends animal
{
	void eat()
	{
		System.out.println("i am vegetarian");
	}
}
class carnivorus extends animal
{
	void eat()
	{
		System.out.println("i am non-vegetarian");
	}
}
public class example1
{

	public static void main(String[] args) 
	{
		Herbivorous h = new Herbivorous();
		carnivorus c = new carnivorus();
		h.eat();
		c.eat();

	}

}
