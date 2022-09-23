package DefaultAndStatic;
interface Sayable{
	//dafault method
	default void say() {
		System.out.println("hello,this is default method");
	}
	//Abstract method
	void sayMore(String msg);
}
public class Default02 implements Sayable{
	public void sayMore(String msg) {
		//implementing abstract method
		System.out.println(msg);
}
	public static void main(String[] args) {
		Default02 dm=new Default02
				();
		dm.say();//calling default method
		dm.sayMore("Work is worship");
		//calling abstarct method
	}
}



