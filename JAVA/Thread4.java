package com.day_5;

public class Thread4 implements Runnable {
	Thread t;
	Thread4(String str){
		t=new Thread(this,str);
		//this will call run() function
		t.start();
	}
	public void run() {
		for(int i=0;i<=5;i++) {
			//yields control to another thread every 5 iterations
			if((i%5)==0){
				System.out.println(Thread.currentThread().getName()+"yield control..");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"has finished executing");
	}
	public static void main(String[] args) {
		new Thread4("Thread1");
		new Thread4("Thread2");
		new Thread4("Thread3");
	}

}
