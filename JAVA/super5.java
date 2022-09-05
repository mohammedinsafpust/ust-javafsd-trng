package com.ust1;

class Animal7{
	
	//default or no-arg constructor
Animal7(){
	System.out.println("I am an animal");
}

//parameterized constructor
Animal7(String type){
	System.out.println("Type:"+type);
 }
}
class Dog5 extends Animal7{
	//default constructor
Dog5(){
	//calling parameterized constructor of the superclass
	super("Animal7");
	
	System.out.println("I am a dog");
}
}
class super5{
	public static void main(String[] args) {
		Dog5 dog1=new Dog5();
	}
} 