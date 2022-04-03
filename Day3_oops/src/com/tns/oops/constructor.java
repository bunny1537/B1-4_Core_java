package com.tns.oops;

public class constructor 
{

	String str;
	int a;
	
	constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+""+a);
	}
	public static void main(String[] args) {
		constructor c=new constructor("banashree",5);
	    c.display();

	}

}
