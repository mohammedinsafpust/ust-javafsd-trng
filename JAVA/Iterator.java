package com.day5;

import java.util.Iterator;
import java.util.TreeSet;

class Main7 {

		public static void main(String[] args) {
				TreeSet<Integer>numbers=new TreeSet<>();
				numbers.add(2);
				numbers.add(2);
				numbers.add(2);
				System.out.println("TreeSet:"+numbers);
				//Calling iterator() method
				Iterator<Integer>iterate=numbers.iterator();
				System.out.println("TreeSet using Iterators:");
				//Accessing elements 
				while(iterate.hasNext());
				System.out.println(iterate.next());
				System.out.print(",");
		}
			}
	

