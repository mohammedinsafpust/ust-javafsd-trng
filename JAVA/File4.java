package com.day_4;

import java.io.FileInputStream;
import java.io.InputStream;

class Main11{
	public static void main(String[] args) {
		byte[] array=new byte[100];
		try {
			InputStream input =new FileInputStream("C:\\Users\\ustjavafsdb201\\input.txt");
			System.out.println("Available byte in the fil:"+ input.available());
			
			//read byte from the input stream
			input.read(array);
			System.out.println("data read from the file");
			
			//convert byte array into string
			String data=new String(array);
			System.out.println(data);
			
			//close the input stream
			input.close();
		}catch (Exception e) {
			
				e.getStackTrace();
			}
		}
	
	}
