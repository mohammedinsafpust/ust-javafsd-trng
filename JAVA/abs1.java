package com.absinter;
abstract class Language{
	//method of abstract class
	public void display() {
		 System.out.println("this is Java programming");
	}

}
class Main extends Language{
	
	public static void main(String[] args) {
		
		
		//create an object of main
		Main obj=new Main();
		
		//access method of main class
		//using object of Main class
		obj.display();
	}
}

