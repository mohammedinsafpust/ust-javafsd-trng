package com.FunctionalInterface;
//Java program to demonstrate Implementation of 
//functional interface using lambda expression

class Test{
	public static void main(String[] args) {
		//lambda expression to create the object
		new Thread(()->{
			System.out.println("New thread created");
		}).start();
	}
}

