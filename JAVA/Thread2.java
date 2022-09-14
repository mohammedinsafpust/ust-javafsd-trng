package com.day_5;
public class Thread2 implements Runnable{
	@Override
	public void run() {
}
	public static void main(String[] agrs) {
		Thread thread1=new Thread();
		thread1.start();
		try {
			thread1.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1.setPriority(1);
		int priority=thread1.getPriority();
		System.out.println(priority);
		System.out.println("Thread Running");
	}
}

