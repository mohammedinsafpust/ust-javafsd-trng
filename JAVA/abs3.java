package com.absinter;

abstract class MotorBike{
	abstract void brake();
	
}
class SportsBike extends MotorBike{
	//implementation of abstract method 
	public void brake() {
		System.out.println("SportBike brake");
	}
}

class MountainBike extends MotorBike{
	
	//implementation of abstract method
	public void brake() {
		System.out.println("Mountainbike brake");
	}
	
}
class Main3{
	public static void main(String[] args) {
	MountainBike m1=new MountainBike();
		m1.brake();
		SportsBike s1=new SportsBike();
		s1.brake();
		
	}
}


