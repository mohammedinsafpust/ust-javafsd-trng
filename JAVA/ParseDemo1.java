package com.day4;

import java.time.Period;

public class ParseDemo1 {
	public static void main(String[] args) {
		//here is the age String in format to parse
		String age="P17Y9M5D";
		
		//Coonverting strings into period value
		//using parse() method
		Period p=Period.parse(age);
		System.out.println("the age is :");
		System.out.println(p.getYears()+"Years\n"+p.getMonths()+"Months\n"+p.getDays()+"Days\n");
	}

}
