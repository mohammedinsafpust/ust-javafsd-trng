package com.day5;

import java.util.ArrayList;
import java.util.Iterator;

class Main4{
	public static void main(String[] args) {
		//Creating an ArrayList
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("ArrayList:"+numbers);
		
		//Creating an instance of Iterator
		Iterator<Integer>iterate=numbers.iterator();
		
		//using the remove() method
		int number=iterate.next();
		System.out.println("Accesswed Element:"+number);
		
		System.out.println("Updated ArrayList");
		
		//Using the hasNext() method
		while(iterate.hasNext()) {
			//Using the forEachRemaining() method
			iterate.forEachRemaining((value)->System.out.println(value+","));
		}
		}
}

