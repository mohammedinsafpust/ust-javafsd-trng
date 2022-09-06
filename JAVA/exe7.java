package com.day4;
//Java program that demonstrates the use of throw
class ThrowExcep
{
	static void fun()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("caught inside fun()");
		}
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("catch in main");
		}
	}
}


