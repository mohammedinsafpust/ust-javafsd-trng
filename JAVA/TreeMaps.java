package com.day5;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
	public static void main(String[] args) {
		//Creating Map using TreeMap
		Map<String,Integer>values=new TreeMap<>();
		
		//Insert elements to map
		values.put("Second", 2);
		values.put("first", 1);
		System.out.println("Map using TreeMap:"+values);
		
		//Replcing the values
		values.replace("First", 11);
		values.replace("second", 22);
		System.out.println("New map:"+values);
		
		//remove elements from the map
		int removedValue=values.remove("First");
		System.out.println("removed value:"+ removedValue);
	}
}
