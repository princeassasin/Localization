package com.example.localization.java;

import java.util.Locale;
import java.util.ResourceBundle;

public class TextLocalizing {

	static void printText(String language, String Country){
		Locale currentLocale;
		ResourceBundle message;
		currentLocale = new Locale(language,Country);
		message = ResourceBundle.getBundle("MessageBundle",currentLocale);
		
		System.out.println(message.getString("greeting"));
		System.out.println(message.getString("inquire"));
		System.out.println(message.getString("farwell"));
	}
	public static void main(String[] args) {
		printText("de", "DE");
		printText("en", "US");
		printText("fr", "FR");

	}

}
