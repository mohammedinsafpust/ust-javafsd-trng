package com.day_4;
class Main2{
	public static void main(String[] args) {
		try {
			//code that generates exception
			int divideByZero=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException=>"+e.getMessage());
		}
		finally
		{
			System.out.println("this is final block");
		}
	}
}
