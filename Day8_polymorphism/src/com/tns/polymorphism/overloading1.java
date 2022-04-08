package com.tns.polymorphism;

public class overloading1 
{
	void assign(float a,float b)
	{
		System.out.println("Area of the rectangle:" +(float)(a*b) );
	}
	void assign(int a,int b)
	{
		System.out.println("Area of the rectangle:" +(a*b));
	}

	public static void main(String[] args)
	{
		overloading o=new overloading();
		o.assign(5,10);
		o.assign(10,20);
	}

	}
