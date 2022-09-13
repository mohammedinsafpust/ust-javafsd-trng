package com.week3;
enum Signal{
	RED(5),Orange(10),GREEN(15);
	
private int x;
private Signal(int x) {
	this.x=x;
}
int getindex() {
	return x;
}
}
	
	
public class Enum {
	public static void main(String[] args) {
		Signal s=Signal.GREEN;
		System.out.println(Signal.GREEN.getindex());
		System.out.println(s.ordinal());
		System.out.println(s.name());
		System.out.println(s.valueOf("RED"));
	}

}
