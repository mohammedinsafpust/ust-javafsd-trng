package com.day_4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File8 {
	public static void main(String[] args){
		String data="This is the output file";
		try {
			//creates a fileWritten
			FileWriter file=new FileWriter("C:\\Users\\ustjavafsdb201\\output.txt");
			
			//creating a buffered writter
			BufferedWriter output=new BufferedWriter(file);
			
			//Writes the string to the file
			output.write(data);
			
			//closes the writter
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
