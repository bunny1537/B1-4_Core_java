package com.tns.abstrac;
class A
{
	String name="bunny";
}
class B extends A
{
	String name="nikki";
	void print()
	{
		System.out.println("hii, ia am "+name);
		System.out.println("hii, ia am "+super.name);
	}
}
public class example3 {

	public static void main(String[] args) {
	B b=new B();
	b.print();

	}

}
