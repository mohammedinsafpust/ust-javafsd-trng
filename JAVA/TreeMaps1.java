package com.day5;
import java.util.TreeMap;
class main2{
	public static void main(String[] args) {
		
		//Creating TreeMap of even numbers
		TreeMap<String,Integer>evenNumbers=new TreeMap<>();
		
		//using put()
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		
		//using putIfAbsent()
		evenNumbers.putIfAbsent("Six", 6);
		System.out.println("treemap of even numbers:"+evenNumbers);
		
		//creating TreeMap of numbers
		TreeMap<String,Integer>numbers=new TreeMap<>();
		numbers.put("One", 1);
		
		//using putAll()
		numbers.putAll(evenNumbers);
		System.out.println("TressMap of numbers:"+numbers);
	}
}
