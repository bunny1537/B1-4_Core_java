package com.tns.inheritance;
class mobiles
{
	void message()
	{
		System.out.println("Hi,moni");
	}
	void call()
	{
		System.out.println("I am Bunny");
	}
}

class samsunggalaxyA31 extends mobiles
{
	void facelock()
	{
		System.out.println("Modern facelock");
	}
}
class oneplus extends mobiles
{
	void games()
	{
		System.out.println("PUB-G");
	}
}

public class Hierarchicalinheritance 
{

	public static void main(String[] args)
	{
		oneplus o=new oneplus();
		o.games();
		o.message();
		o.call();
		samsunggalaxyA31  a =new samsunggalaxyA31();
		a.facelock();

	}

}
