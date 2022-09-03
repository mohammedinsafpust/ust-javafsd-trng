package com.ust;

class Nested_if {
	public static void main(String[] args) {
		int number =0;
		//checks if number is greater than 0
		if (number>0) {
			System.out.println("The number is positive.");
		}
		//checks if number is less than 0
		else if (number<0) {
			System.out.println("The number is negetive.");
		}
		//if both condition is false
		else {
			System.out.print("The number is 0");
		}
	}

}
