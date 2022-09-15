package com.day_5;
//anonymus Class Example
abstract class Animal{
	abstract void sound();
}

public class NameLessClass {
	public static void main(String[] args) {
		Animal a=new Animal() {
			void sound() {
				System.out.println("animal sound");
			}
		};
		a.sound();
	}
}
