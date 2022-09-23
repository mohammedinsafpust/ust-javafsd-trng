package DefaultAndStatic;
interface Sayable1{
	//default method
	default void say() {
		System.out.println("Hello,this is default method");
	}
	//Abstract method
	void sayMore(String msg);
	//static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}
public class Default03 implements Sayable1{
	public void sayMore(String msg) {
		//implements a abstract method
		System.out.println(msg);
	}
public static void main(String[] args) {
	Default03 dm=new Default03();
	dm.say();//calling default method
	dm.sayMore("Work is worship");//calling abstact method
	Sayable1.sayLouder("hellooo..");//calling static method
}
}

