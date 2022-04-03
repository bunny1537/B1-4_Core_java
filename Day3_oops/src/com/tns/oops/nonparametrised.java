package com.tns.oops;

public class nonparametrised 
		{
			String str;
			int a;
			nonparametrised()
			{
				str="banashree";
				a=11;
			}
			void display()
			{
				System.out.println(str+""+a);
			}
			public static void main(String[] args) {
				nonparametrised c=new nonparametrised();
			    c.display();

	}
	}
