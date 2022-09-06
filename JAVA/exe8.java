package com.day4;

//java program to demonstrate working of throws
class ThrowsExecp
{
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}
	public static void main(String arg[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main");
		}
	}
}
