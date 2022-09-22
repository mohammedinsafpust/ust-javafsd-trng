package com.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReference1 {
	public static void main(String[] args) {
		List names=new ArrayList();
		
		names.add("Mahseh");
		names.add("Suresh");
		names.add("Rameesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		names.forEach(System.out::println);
	}
}
