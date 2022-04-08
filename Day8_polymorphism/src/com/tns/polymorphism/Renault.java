package com.tns.polymorphism;

public class Renault
{
	String color;
	int speed;
	Renault()
	{
		System.out.println("i bought new car");
	}
Renault(String color,int speed)
{
	this.color=color;
	this.speed=speed;
}
	public static void main(String[] args) 
	{
		Renault r=new Renault();
		Renault r1=new Renault("pink", 70);
		System.out.println(r1.color+""+r1.speed);
	}

}
