package com.ust;

public class If_else {
	public static void main(String[] args) {
		int number=10;
		//check if number is greater than 0
		if (number>0) {
			System.out.println("The number is positive.");
			
		}
		//execute this block
		//if number is not grater than 0
		else {
			System.out.println("The number is not positive.");
		}
		System.out.println("Statement outside if...else block");
	}
}