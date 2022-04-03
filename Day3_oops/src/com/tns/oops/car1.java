package com.tns.oops;

public class car1 {

		String str;
		car1(String s)
		{
			str=s;
		}
		void print()
		{
			System.out.println("This is "+str);
			
		}
		public static void main(String[] args) {
			car1 a =new car1("audi");
		 
		    car1 b =new car1("bmw");
		   
		    car1 m =new car1("mercedes-benz");
		   a.print();
		   b.print();
		   m.print();
	}

}
