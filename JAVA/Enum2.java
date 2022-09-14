package com.day4;
enum Size1{
SMALL,MEDIUM,LARGE,EXTRALARGE
}
class Test1{
	Size pizzaSize;
	public Test1(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
		System.out.println("i ordered a small size pizza");
		break;
		case MEDIUM:
		System.out.println("i ordered a medium size pizza");
		break;
		default:
		System.out.println("i don't know which one to order");
		break;
		}
	}
}
public class Enum2
{
public static void main(String[] args) {
	Test1 t1=new Test1(Size.MEDIUM);
	Test1 t2=new Test1(Size.SMALL);
	t1.orderPizza();
	t2.orderPizza();
}
}