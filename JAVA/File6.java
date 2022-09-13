package com.day_4;

import java.io.FileOutputStream;

public class File6 {
	public static void main(String[] args) {
		String data="This is a line text inside the file";
		
		try
		{
			FileOutputStream output=new FileOutputStream("C:\\Users\\ustjavafsdb201\\output.txt");
			
			byte[] array=data.getBytes();
			
			//written byte to the file
			output.write(array);
			
			output.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();		}
	}

}
