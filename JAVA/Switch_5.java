package com.ust;
//Java program to demonstrate switch case
//with multiple cases without break statements
public class Switch_5 {
	public static void main(String[] args)
	{
		int day=2;
		String dayType;
		String dayString;
		
		switch (day) {
		case 1:
				dayString="Monday";
				break;
		case 2:
				dayString="Tuesday";
				break;
		case 3: 
				dayString="Wednessday";
				break;
		case 4:
				dayString="Thursday";
				break;
		case 5:
				dayString="friday";
				break;
		case 6:
				dayString="saturday";
				break;
		case 7:
				dayString="sunday";
				break;
		default:
				dayString="Invalid day";
				
		}
		switch (day) {
		//multiple cases without break statements
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
				dayType="Weekday";
				break;
		case 6:
		case 7:
				dayType="Weekend";
				break;
		default:
				dayType="Invalid datatype";
		}
		System.out.println(dayString+" is a "+dayType);
		}
	}

