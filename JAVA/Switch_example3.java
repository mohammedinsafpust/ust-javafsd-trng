package com.ust;

class Switch_example3 {
	public static void main(String[] args) {
		int expression=9;
		
		switch(expression){
		
		case 2:
			System.out.println("small size");
			break;
			
		case 3:
			System.out.println("Large Size");
			break;
			
			//default case
		default:
			System.out.println("unknown size");
			
		}
	}
}
