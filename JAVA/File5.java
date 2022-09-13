package com.day_4;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class File5{
	public static void main(String[] args) {
		String data="This is a line inside the file ";
		try {
			OutputStream out=new FileOutputStream("C:\\Users\\ustjavafsdb201\\Output.txt");
			
			//Converts the string into bytes
			byte[] dataByte=data.getBytes();
			
			//Writing data to the output stream
			out.write(dataByte);
			System.out.println("data is written to the file");
			
			//close the output stream
			out.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}

