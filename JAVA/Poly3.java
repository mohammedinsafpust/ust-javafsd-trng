package com.poly;
class Animal2{
	protected String name;
	
	protected void display() {
		System.out.println("i am an animal");
		
	}
}
class Dog1 extends Animal2{
	public void getInfo() {
		System.out.println("my name is "+ name);
	}
}
class Main3{
	public static void main(String[] args) {
		//create an object of the subclass 
		Dog1 labrador=new Dog1();
		
		//acess protected field and method 
		//using the object of subclass
		labrador.name="rocky";
		labrador.getInfo();
		
	}
}

