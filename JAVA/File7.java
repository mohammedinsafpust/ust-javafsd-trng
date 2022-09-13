package com.day_4;

import java.io.BufferedReader;
import java.io.FileReader;

public class File7 {
	public static void main(String[] args) {
		
		//Create an array of character
		char[] array=new char[100];
		
		try {
			//Create a FileReader
			FileReader file=new FileReader("C:\\Users\\ustjavafsdb201\\input.txt");
			
			//Create a BufferedReader
			BufferedReader input=new BufferedReader(file);
			
			//reads characters
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			
			//Closes the reader
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
