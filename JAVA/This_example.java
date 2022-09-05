package com.ust1;

class This_Test {
	int val1;
	int val2;
//Parameterized constructor
	This_Test(int val1,int val2){
		this.val1=val1+val1;
		this.val2=val2+val2;
	}
	void display()
	{
		System.out.println("Value val1="+val1+"value val2="+val2);
	}
}


class Main1{
	public static void main(String[] args)
	{
		This_Test object=new This_Test(5,10);
		object.display();
		
	}
}