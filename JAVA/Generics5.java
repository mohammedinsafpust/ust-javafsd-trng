package com.generics;

class GenericsClass1<T extends String>{
	public void display() {
		System.out.println("This is a bounded type generics class");
	}
}

class Main5 {
	public static void main(String[] args) {
		//create an objectvof GenericClass
		GenericsClass1<String> obj=new GenericsClass1<>();
	}

}
