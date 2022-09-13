package com.sbv;

interface Employee1{
	void calculateSalary(double s);
	 void fetchDepartment(String d);
}

class Engineer1 implements Employee1{
	public void calculateSalary(double s) {
		int bonus=2000;
		double total=s+bonus;
		System.out.println("Your salary is :"+total);
	}
	public void fetchDepartment(String d) {
		System.out.println("Your Department is "+d);
	}
}
class Doctor1 implements Employee1{
	public void calculateSalary(double s1) {
		int bonus=2000;
		double total=s1+bonus;
		System.out.println("your salary is "+total);
	}
	public void fetchDepartment(String d) {
		System.out.println("your departmnet is "+d);
	}
}
public class Week2_2{
	public static void main(String[] args) {
		Engineer1 engg=new Engineer1();
		engg.calculateSalary(28000);
		engg.fetchDepartment("ec");
		
		Doctor1 doc=new Doctor1();
		doc.calculateSalary(23000);
		doc.fetchDepartment("eye");
	}
}
