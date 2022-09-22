package com.lamda;

@FunctionalInterface
interface MyInterface{
	double getPiValue();
}



public class Lamda1 {
		public static void main(String[] args) {
			//declare a reference to MyInterface
			MyInterface ref;
			
			//lambda expression
			ref=()->3.1415;
			
			System.out.println("Value of Pi="+ref.getPiValue());
	}

}
