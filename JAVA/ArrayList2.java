package com.day5;

import java.util.ArrayList;

class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String>languages=new ArrayList<>();
		
		//add elements in the array list
		languages.add("java");
		languages.add("kotlin");
		languages.add("c++");
		System.out.println("ArrayList:"+languages);
		
		//change the elements of the array list
		languages.set(2, "javaScript");
		System.out.println("Modified ArrayList"+languages);
	}
}
