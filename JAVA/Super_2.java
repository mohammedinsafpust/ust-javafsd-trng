package com.ust1;

class Super_2 {
	//overridden method
	public void display() {
		System.out.println("I am an animal");
	}

}
class Dog1 extends Animal{
	//overring method
	@Override
	public void display() {
		System.out.println("i am a dog");
	}
	public void printMessage() {
		//this call overriding method
		display();
		
		//this calls overridding method
		super.display();
		
	}
}
class Main8{
	public static void main(String[] args) {
		Dog1 dog1=new Dog1();
		dog1.printMessage();
		
	}
}
