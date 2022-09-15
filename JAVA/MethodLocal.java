package com.day_5;

public class MethodLocal {
	void display() {
		int x=5;
		
		class MethodInner{
			void display()
			{
				System.out.println("In method Local");
			}
		}
		MethodInner i=new MethodInner();
		i.display();
	}//method ends
	public static void main(String args[]) {
		MethodLocal m=new MethodLocal();
		m.display();
		System.out.println("calling outer class");
	}
}
