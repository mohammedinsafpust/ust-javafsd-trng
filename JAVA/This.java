package com.ust;

public class This {
	static int x=1;
	private int y=3;
	public void method1(int x) {
		This t=new This();
		this.x=2;
		y=4;
		
		System.out.println("Test.x"+This.x);
		System.out.println("t.x"+t.x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
		
	}
	public static void main(String args[]) {
		This t=new This();
		t.method1(5);
	}

}
