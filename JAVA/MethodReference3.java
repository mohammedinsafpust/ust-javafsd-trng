package com.methodreference;
interface Sayable{
	void say();
}

public class MethodReference3 {
	public static void saySomething() {
		System.out.println("hello,this is static method");
	}
	public static void main(String[] args) {
		//Referring static method
		Sayable sayable=MethodReference3::saySomething;
		//Calling interface merthod
		sayable.say();
	}
}
