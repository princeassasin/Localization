package com.example.localization.java;

import java.text.DateFormat;
//import java.text.DateFormat.*;
import java.util.*;

public class DateLocale {

	static void printDate(Locale locale){
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.LONG,locale);
		Date currentDate = new Date();
		String date = formatter.format(currentDate);
		System.out.println(date+"\t locale date is \t"+locale);
		
	}
	public static void main(String[] args) {
		
		printDate(Locale.CANADA);
		printDate(Locale.CHINA);
		printDate(Locale.ENGLISH);
		printDate(Locale.GERMAN);
		printDate(Locale.FRANCE);
		printDate(Locale.ITALIAN);

	}

}
