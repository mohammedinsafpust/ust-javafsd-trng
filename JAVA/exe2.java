package com.day4;
class main2{
	public static void main(String[] args) {
		try {
			//code that generates exception
			int divideByZero=5/0;
		}
		
		catch (ArithmeticException e) {
			System.out.println("ArithmaticException=>"+e.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}
	}
}
