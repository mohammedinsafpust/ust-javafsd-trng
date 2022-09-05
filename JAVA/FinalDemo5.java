package com.ust1;

class FinalDemo5 {
//create a final method
	public final void display() {
		System.out.println("This is a final method");
	}
}
class Main11 extends FinalDemo5{
	//try to override Final method
public final void display() {
	System.out.println("The final method is overridden");
}
}
