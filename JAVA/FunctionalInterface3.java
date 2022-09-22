package com.FunctionalInterface;

//java program to demonstrate implementation of 
//functional interface using lambda expression
class Test2{
	public static void main(String[] args) {
		//lambda expression to create the object
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
	}
}

public class FunctionalInterface3 {

}
