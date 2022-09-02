package com.ust;


public class casting {
	public static void main(String arg[]) {
		int x=5;
		float y=5.5f;
		long l=10;
		double d=7.5;
		
		l=x;  //upcasing implicitly done
		x=(int)l;
		y=(float)d; //downcasing
		d=y;
	}

}
