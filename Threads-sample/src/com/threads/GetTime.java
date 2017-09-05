package com.threads;

import java.util.*;
import java.text.DateFormat;

public class GetTime implements Runnable {
	        
	
	// variables for getting time, location and their output
	Date currentDate;
	Locale currentLocale;
	DateFormat dateFormat;
	DateFormat timeFormat;
	String timeOut;
	String dateOut;
	
	// when code will be executed
	private int Start;
	// constructor
	public GetTime(int Start) {
		this.Start=Start;
	}
	
	public void run(){


		while(true) {
		// contains Date and Time
		currentDate = new Date();
		// defines time format for location
		currentLocale = new Locale("sk","EU");
		// define dates and times with LONG style
		timeFormat = DateFormat.getTimeInstance(DateFormat.LONG,currentLocale);
		dateFormat = DateFormat.getDateInstance(DateFormat.LONG,currentLocale);
		// convert date and time to String so we can print them
		timeOut = timeFormat.format(currentDate);
		dateOut = dateFormat.format(currentDate);
		// print time and date with "br"
		System.out.println(timeOut);
		System.out.println(dateOut);
		System.out.println();
		try {
			// thread will sleep for start seconds
			Thread.sleep(Start*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}	
	}
}
