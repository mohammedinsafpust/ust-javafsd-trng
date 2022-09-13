package com.day_4;

import java.io.File;

class Main9{
	public static void main(String[] args) {
		//creates a file object
		File file =new File("C:\\Users\\ustjavafsdb201\\file.txt");
		
		//delete the file
		boolean value=file.delete();
		if(value) {
			System.out.println("The file is deleted");
		}

	else {
		System.out.println("The file is not deleted");
	}

}}