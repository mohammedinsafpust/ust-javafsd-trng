package com.inter;
//Java code for using 'this' keyword
//to return the current class instance
class Test1
{
	int a;
	int b;
	//Default contructor
	Test1()
	{
		a=10;
		b=20;
	}
	
	//Method that returns current class instance
	Test1 get()
	{
		return this;
	}
	//Display vale of variable a and b
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	public static void main(String[] args)
	{
		Test1 object=new Test1();
		object.get().display();
	}
}

