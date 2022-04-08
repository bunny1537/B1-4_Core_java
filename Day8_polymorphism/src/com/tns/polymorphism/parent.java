package com.tns.polymorphism;

 class Base
{
	void method1()
	{
		System.out.println("hii how u");
	}
}
class derived extends Base
{
	void method1()
	{
		System.out.println("fine");
	}
	
	class parent
	{
	public void main(String[] args) 
	{
		
      Base b =new derived();
      b.method1();
      derived d=new derived();
      d.method1();
	}
	}

}
