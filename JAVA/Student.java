package com.ust;
//firstName,billOfThePatient
public class Student {
int sTD;
String name;
int age;
String course;
static int count;

//public Student() {
	//contructors don't have return type
//}

{
	int z=7;
	System.out.println(z);
}




public static void main(String arg[]) {
	int x=5;
	float f=12.45f;
	String str;
	Student s=new Student();  //defaut contructor/zero arg constructor
	Student s1=new Student();
	s.age=22;
	Student s2=new Student();
	System.out.println(s.age);
System.out.println(x);
s.count=15;
s1.age=25;
System.out.println(s1.age);
System.out.println(s.count);
System.out.println(s1.count);
}
}
