package com.day5;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		//Creating list using the ArrayList class 
		List<Integer>numbers=new ArrayList<>();
		
		//Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List:"+ numbers);
		
		//Acess elements fron]m the list
		int number=numbers.get(2);
		System.out.println("Accessed Elements:"+number);
		
		//remove element from the list
		int removedNumber=numbers.remove(1);
		System.out.println("Removed Element:"+removedNumber);
	}

}
