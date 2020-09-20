package com.lcdscreen;

import java.util.regex.Pattern;

public class Validator {
	
	private static Pattern DIGIT_PATTERN = Pattern.compile("^\\d+$");
	
	private Validator() {
	
	}
	
	public static boolean isValidNumber(String s) {
		if (s == null) {
			return false;
		}
		return DIGIT_PATTERN.matcher(s).matches();
	}
	
}
