package com.enu;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class Enumeration2 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("p");
		hs.add("Q");
		hs.add("r");
		Enumeration e=Collections.enumeration(hs);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
