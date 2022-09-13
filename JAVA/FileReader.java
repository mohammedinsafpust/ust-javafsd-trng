package com.day_4;

import java.io.FileReader;

class Main8{
	public static void main(String[] args) {
		char[] array=new char[100];
		try {
			//Create a reader using the FileReader
			FileReader input=new FileReader("C:\\Users\\ustjavafsdb201\\input.txt");
			
			//Reads characters
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			
			//closes the reader
			input.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}

