package com.ust1;

class Test_this {
	void print()
	{
		//calling functionshow()
		this.show();
		
		System.out.println("test_this::print");
	}
	void show()
	{
		System.out.println("Test_this::show");
	}
	

}
class Main3{
	public static void main(String args[]) {
		Test_this t1=new Test_this();
		t1.print();
	}
}