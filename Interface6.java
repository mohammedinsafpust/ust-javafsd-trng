package com.inter;
//Java program to illustrate the Concept 
//of Autoboxing and Unboxing

//importing required classes
import java.io.*;

//Main class
class Main6{
	//Main driver method 
	public static void main(String[] args)
	{
		//Creating an interger object
		//with custom value say it be 10
		Integer i=new Integer(10);
		
		//unboxing the object
		int i1=i;
		
		//Print statements
		System.out.println("VAlue of i:"+i);
		System.out.println("value of i1:"+1);
		
		//Autoboxing of character
		Character X='a';
		
		//Auto-unboxing of Character
		char ch=X;
		
		//print statements
		System.out.println("VAlue of ch:"+ch);
		System.out.println("Value of X:"+X);
		
	}
}

