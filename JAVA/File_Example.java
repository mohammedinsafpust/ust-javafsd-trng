package com.week3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Example {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\ustjavafsdb201\\ABC.txt");
		
		try
		{
			FileOutputStream fstm=new FileOutputStream(f);
			byte[] b="This i am writing to file".getBytes();
			if(f.createNewFile())
			{
			System.out.println("New file created");
			
			}
		
		else
		{
			System.out.println("File exist");
			fstm.write(b);
			
		}}
		
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	}
