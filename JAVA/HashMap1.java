package com.day5;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a map using the HashMap
		Map<String,Integer>numbers =new HashMap<>();
		
		//Insert elements to the map
		numbers.put("one", 1);
		numbers.put("Two", 2);
		System.out.println("Map:"+numbers);
		
		//Access keys of the map
		System.out.println("keys:"+numbers.keySet());
		
		//Access values of the map
		System.out.println("Values:"+numbers.values());
		
		//Remove Elements from the map
		int value=numbers.remove("Two");
		System.out.println("Removed value"+value);

	}

}
