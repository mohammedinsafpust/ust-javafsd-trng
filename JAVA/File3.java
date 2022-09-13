package com.day_4;

import java.io.File;

class Main10{
	
		public static void main(String[] args) {
			//creates a file object
			File file=new File("C:\\Users\\ustjavafsdb201");
			
			//return an array of all files
			String[] fileList=file.list();
			
			for(String str:fileList) {
				System.out.println(str);
			}
		}
	}
