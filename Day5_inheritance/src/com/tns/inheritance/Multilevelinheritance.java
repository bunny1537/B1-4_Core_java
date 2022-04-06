package com.tns.inheritance;
class R6
{
	void print()
	{
		System.out.println("Hello World!");
	}
}
class R3 extends R6
{
	void display()
	{
		System.out.println("I am bunny");
	}
}
class R15 extends R3
{
	void assign()
	{
		System.out.println("This is my book");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		R15 r =new R15();
		
		r.print();
		r.display();
		r.assign();

	}

}
