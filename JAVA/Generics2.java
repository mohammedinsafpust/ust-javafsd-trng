package com.generics;
//java program to show working
//of user-default Generic classes
//We use <>to specify Parameter type 
class Test1<T>{
	//An object of type T is declared
	T obj;
	Test1(T obj){this.obj=obj;}//constructor
	public T getObject() {return this.obj;}
	
}

//Driver class to test above
class Main2{
	public static void main(String[] args)
	{
		//instance of Integer type
		Test1<Integer>iObj=new Test1<Integer>(15);
		System.out.println(iObj.getObject());
		
		//instance of String type
		Test1<String>sObj
		=new Test1<String>("GeeksForGreeks");
		System.out.println(sObj.getObject());
		iObj=sObj;//This result an error
	}
}
