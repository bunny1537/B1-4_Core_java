package com.tns.inheritance;

 class parent 
{
   void print()
   {
	   System.out.println("Hello,This is Banashree");
   }
}
    class child extends parent
   {
	   void display()
	   {
		   System.out.println("Hello world"); 
	   }
   }
    class singleinheritance
    {
	public static void main(String[] args)
    {
		child c = new child();
		c.display();
		c.print();
	}
    }
