package com.generics;

class GenericsType7<T>{
	T obj;
	public T get() {
		return this.obj;
		
	}
	public void set(T obj) {
		this.obj=obj;
	}
}

public class Generics7 {
//Java Ganerics Method
	public static<T>boolean isEqual(GenericsType7<T>g1,GenericsType7<T>g2)
	{
		return g1.get().equals(g2.get());
	}
	
	public static void main(String args[]) {
		GenericsType7<String>g1=new GenericsType7<>();
		g1.set("Panka");
		
		GenericsType7<String>g2=new GenericsType7<>();
		g2.set("panka");
		
		boolean isEqual=Generics7.<String>isEqual(g1,g2);
		
		//above statement can be written simply as
		isEqual=Generics7.isEqual(g1,g2);
	}
}