package com.threads;

public class Main {

	public static void main(String[] args) {
	
	// create threads using runnable interface
	Runnable getTime = new GetTime(1);
	Runnable getTimeAgain = new GetTime(10);
	Runnable checkMail = new CheckMail(5);

	// start all 3 threads at same time
	new Thread(getTime).start();
	new Thread(getTimeAgain).start();
	new Thread(checkMail).start();
	
	}
	
}
