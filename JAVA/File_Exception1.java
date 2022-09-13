package com.day_4;
//import the File class
import java.io.File;

class Main7{
	public static void main(String[] args) {
		//create a file object for the current location
		File file =new File("C:\\Users\\ustjavafsdb201\\newFile.txt");
		
		try {
			//trying to create a file based on the object
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("the new file is created");
			}
			else {
				System.out.println("the file already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}


