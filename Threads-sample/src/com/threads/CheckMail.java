package com.threads;

public class CheckMail implements Runnable {
	private int Start;
	
	public CheckMail(int Start) {
		this.Start=Start;
	}
	
	public void run() {
		while(true) {
			System.out.println("Checking Mail!");
			try {
				Thread.sleep(Start*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
