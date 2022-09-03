package com.ust;

class Employee {
	int empID;
	String Employee_name="insaf";
	int age=22;
	double salary=25599;
	String destination="manager";
	void salary() {
		System.out.println("salary:"+salary);
	}
	
		void salary(int a) {
		if(age>35)
			System.out.println("eligible for promotion");
		else
			System.out.println("not eligible for promotion");
	}
}
class Engineer extends Employee{
	void salary() {
		salary=50000;
		System.out.println("name:"+Employee_name);
		System.out.println("using super");
		super.salary(3);
		
	}
	public static void main(String arg[]) {
		Engineer e=new Engineer();
		e.salary();
		e.salary(e.age);
		Employee em = new Employee();
		em.salary();
	}
}
