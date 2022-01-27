package com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Full form of "+
					DateFormat.getDateInstance
										(0, Locale.CHINA).format(new Date()));

	System.out.println("Current Time Format :"
					+DateFormat.getTimeInstance(3,Locale.US)
												.format(new Date()));
	
	}

}
