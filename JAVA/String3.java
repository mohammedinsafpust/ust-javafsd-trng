package com.ust2;

class Main3{
	public static void main(String[] args) {
		String str1="C++ Programming";
		
		//all occurrences of "C++" is replaced with "Java"
		System.out.println(str1.replace("C++","Java"));//JAva Programming
		
		//all occurrences of "aa is replaced with "zz
		System.out.println("aa bb aa zz".replace("aa","zz")); //zz bb zz zz
		
		//substring not in the string
		System.out.println("Java".replace("C++","c"));//Java
	}
}

