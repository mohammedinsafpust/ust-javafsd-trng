package com.absinter;

interface polygon{
	void getArea(int length,int breadth);
}
//implement the polygon interface
class Rectangle implements polygon{
	//implementation of abstract method
	public void getArea(int length,int breadth) {
		System.out.println("the area of the rectangle is"+(length*breadth));
	}
}
	class Main4{
		public static void main(String[] args) {
			Rectangle r1=new Rectangle();
			r1.getArea(5, 6);
		}
	}
