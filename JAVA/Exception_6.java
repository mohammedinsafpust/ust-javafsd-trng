package com.day_4;

//Java program that demonstrate the use of throw
class ThrowExcep
{
	static void fun()
	{
		try {
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("catch inside fun()");
			throw e;//rethrowing the exception
		}
	}
	public static void main(String[] args)
	{
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch in main.");
		}
	}
}

public class Exception_6 {

}
