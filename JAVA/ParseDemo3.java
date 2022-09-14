package com.day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDemo3 {
	public static void main(String[] args) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date="14/10/2020";
		LocalDate localDate=LocalDate.parse(date, formatter);
		System.out.println("parse local date:"+localDate);
		System.out.println("formatted local date:"+formatter.format(localDate));
	}

}
