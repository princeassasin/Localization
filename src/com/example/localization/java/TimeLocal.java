package com.example.localization.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeLocal {

	static void printTime(Locale locale){
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.MEDIUM,locale);
		Date currentDate = new Date();
		String date = formatter.format(currentDate);
		System.out.println(date+"\t locale date in \t"+locale);
		
	}
	public static void main(String[] args) {
		printTime(Locale.CANADA);
		printTime(Locale.CHINA);
		printTime(Locale.ENGLISH);
		printTime(Locale.FRENCH);
		printTime(Locale.JAPANESE);

	}

}
