package com.ust1;

class Animal {
	//overridden method
	public void display()
	{
		System.out.println("i am an animal");
	}
}


class Dog extends Animal{
	//overriding method
	@Override
	public void display() {
		System.out.println("i am dog");
	}
public void printMessage() {
	display();
}
}


class Main7{
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.printMessage();
	}
}