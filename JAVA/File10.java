package com.day_4;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class File10 {
	public static void main(String[] args) {
		
		String data="this is a line of text inside the file";
		
		try {
			//Create a FileOutputStream
			FileOutputStream file=new FileOutputStream("output.txt");
			
			//Create a BufferedOutputStream
			BufferedOutputStream output=new BufferedOutputStream(file);
			
			byte[] array=data.getBytes();
			
			//Writes data to the output stream
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
