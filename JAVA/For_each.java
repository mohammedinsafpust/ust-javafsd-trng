package com.ust;

class For_each {
	public static void main(String[] args) {
		
		//an array of numbers
		int[] numbers= {3,4,5,-5,0,12};
		int sum =0;
		
		//iteration through each element of the array
		for(int number:numbers) {
			sum+=number;
		}
	System.out.println("Sum="+sum);

}}
