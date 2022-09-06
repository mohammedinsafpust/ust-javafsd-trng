package com.ust2;

class Main8{
	public static void main(String[] args) {
	String str1="Learn Java";
	String str2="Java";
	String str3="java";
	Boolean result;
	
	
	//true beacause"learn Java"contains"java"
	if(str1.contains(str2)) {
		System.out.println(str1+"contains"+str2);
		}
	else {
		System.out.println(str1+"doesn't contains"+str2);
	}
	//contains() is case-sensitive
	//false beacause "Learn Java"doesn't contains "java"
	if(str1.contains(str3)) {
		System.out.println(str1+"contains"+str3);
	}
	else {
		System.out.println(str1+"doesn't contain"+str3);
	}
}
}
