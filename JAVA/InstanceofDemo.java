package com.ust;

class Fruit{}
class Vehicle{}
public class InstanceofDemo {

	public static void main(String[] args)
	{
		Fruit pineapple=new Fruit();
		Vehicle truck = new Vehicle();
		
		System.out.println("pineapple IS A Fruit:"+ (pineapple instanceof Fruit));
		System.out.println("truck IS A Vehicle:"+(truck instanceof Vehicle));
	}
}
