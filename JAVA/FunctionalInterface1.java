package com.FunctionalInterface;
@FunctionalInterface
interface sayable{
	void say(String msg);//abstract method
	//It can contain any number of Object class methods.
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterface1 implements sayable{
	public void say(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionalInterface1 file=new FunctionalInterface1();
		file.say("Hello there");
	}
}
