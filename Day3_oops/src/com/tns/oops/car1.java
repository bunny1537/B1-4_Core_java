package com.tns.oops;

public class car1 {

		String str1,str2,str3;
		car1()
		{
			str1="audi";
		      str2="bmw";
		      str3="mercedes";	
		}
		void display()
		{
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			
		
		}
		public static void main(String[] args) {
			car1 a =new car1();
		   a.display();
		    car1 b =new car1();
		   b.display();
		    car1 c =new car1();
		   c.display();

	}

}
