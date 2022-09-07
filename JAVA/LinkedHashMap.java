package com.day5;
import java.util.LinkedHashMap;


	class Main{
		public static void main(String[] args) {
			//Creating a LinkedHashMap of even numbers
			LinkedHashMap<String,Integer>evenNumbers=new LinkedHashMap<>();
			evenNumbers.put("Two",2);
			evenNumbers.put("Four",4);
			System.out.println("linkedHashMap1:"+evenNumbers);
			
			//Creating a LinkedHashMap from other linkedHashMap
			LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumbers);
			numbers.put("Three",3);
			System.out.println("LinkedHashMap2:"+numbers);
		}
	}

