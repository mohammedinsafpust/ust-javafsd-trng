package com.day_5;

public class Example_runnable implements Runnable {
	public static void main(String[] args) {
		Runnable r=new Example_runnable();
		r.run();
	}
	@Override
	public void run() {
		System.out.println("Doing heavy proccessing-START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			//get datbase connection,delete unused data from DB
			doDBProcessing();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy proccessing-END"+Thread.currentThread().getName());
	}
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
}
