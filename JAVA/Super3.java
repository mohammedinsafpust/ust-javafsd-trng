package com.ust1;

class Super3 {
	protected String type="animal";
}

class Dog3 extends Super3{
	public String type="mammal";
	
	public void printType() {
		System.out.println("i am a "+ type);
		System.out.println("I am an "+ super.type);
	}
}
class Main9{
	public static void main(String[] args) {
		Dog3 dog1=new Dog3();
		dog1.printType();
	}
}