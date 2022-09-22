package com.methodreference;

import java.util.function.BiFunction;

public class MethodReference4 {
	public void printMsg() {
		System.out.println("hello,this is instance method");
	}
	public static void main(String[] args) {
		Thread t2=new Thread(new MethodReference4()::printMsg);
		t2.start();
		
	}
}

