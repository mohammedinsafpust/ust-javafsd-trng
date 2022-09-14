package com.day_5;

public class JoinDemo implements Runnable {
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Current thread:"+t.getName());
		//check if current thread is alive
		System.out.println("Is Alive?"+t.isAlive());
	}
	public static void main(String[] args) throws Exception {
		Thread t=new Thread(new JoinDemo());
		t.start();
		
		//Waits for 1000ms this thread to die
		t.join(1000);
		System.out.println("\nJoining after 1000"+"milliseconds:\n");
		System.out.println("Is alive?"+t.isAlive());
		
	}

}
