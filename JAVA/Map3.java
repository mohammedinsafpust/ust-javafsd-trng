package com.holder;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {

		Map<Integer,String>m=new HashMap<>();
		m.put(1,"s");
		m.put(2, "A");
		m.put(3, "f");
		
		Set keys=m.keySet();
		System.out.println(keys);
	}
	
}
