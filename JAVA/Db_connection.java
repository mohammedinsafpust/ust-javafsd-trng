package com.day_5;
public class Db_connection extends Thread{
	public static void main(String[] args) {
	Runnable r=new Example_runnable();
	r.run();
}
		
		public Db_connection(String name) {
			super(name);
		}
		@Override
		public void run() {
		System.out.println("My thread-START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			//Get database connection,delete unused data from DB
			doBProcessing();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread-END"+Thread.currentThread().getName());
}

private void doBProcessing() throws InterruptedException{
	Thread.sleep(5000);
}

}
