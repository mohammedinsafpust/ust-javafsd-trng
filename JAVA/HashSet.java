package com.day5;

import java.util.HashSet;

class Main5{
	public static void main(String[] args) {
		HashSet<Integer>evenNumber=new HashSet<>();
		
		
	//using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet:"+evenNumber);
		
		HashSet<Integer>numbers=new HashSet<>();
		
		//Using addall() method
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New HashSet:"+numbers);
		
	}
}

