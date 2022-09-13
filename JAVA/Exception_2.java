package com.week3;

class SuperException
{
	void display()
	{
		System.out.println("Display test");
	}
}

public class Exception_2 extends SuperException {
	public static void main(String[] args) {
		SuperException s=new SuperException();
				
		Exception_2 e=new Exception_2();
		SuperException s1=new SuperException();
		Exception_2 e1=(Exception_2) new SuperException();
		
	}

}
 