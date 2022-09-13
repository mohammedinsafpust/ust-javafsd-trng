package com.day_4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Main14{
	public static void main(String[] args) {
		try {
			
			//create file input stream
			FileInputStream file=new FileInputStream("C:\\Users\\ustjavafsdb201\\input.txt");
			
			//create bufferedinputstream
			BufferedInputStream input =new BufferedInputStream(file);
			
			//reads first byte from file
			int i=input.read();
			
			while(i!=-1) {
				System.out.println((char)i);
				
				//reads next byte from the file
				i=input.read();
				
			}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
