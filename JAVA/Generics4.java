package com.generics;

class Generics4{
	public static void main(String[] args) {
		//initialize the class with integer data
		DemoClass demo=new DemoClass();
		
		//generics method working with string
		demo.<String>genericsMethod("java progranmming");
		
		//generics methods working with integer
		demo.<Integer>genericsMethod(25);
	}
}
class DemoClass{
	//create a generics method
	public<T>void genericsMethod(T data){
		System.out.println("Generics Method:");
		System.out.println("data passed:"+data);
	}
}
