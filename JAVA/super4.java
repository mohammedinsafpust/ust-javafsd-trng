package com.ust1;

class Animal5 {
//default or no-arg constructor of class Animal
	Animal5(){
		System.out.println("i am an animal");
	}
}
class Dog2 extends Animal5{
	//default or no-arg constructor of class dog
	Dog2(){
		//calling default constructor of superclass
		super();
		
		System.out.println("i am a dog");
	}
}


class super4{
	public static void main(String[] args) {
		Dog2 dog1=new Dog2();
	}
}
class Animal6{
	//default or no-arg constructor
	Animal6(){
		System.out.println("i am an animal");
	}
}