package com.week3;

public class Execption {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		try {
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
	}
}
