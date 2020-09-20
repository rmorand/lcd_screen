package com.lcdscreen;

import java.util.LinkedList;
import java.util.List;

public class Converter {
	
	private Converter(){
		// Private constructor
	}
	
	public static List<Integer> numberToDigits(String userNumber) {
		LinkedList<Integer> digits = new LinkedList<>();
		
		for (String s : userNumber.split("")) {
			digits.add(Integer.valueOf(s));
		}
		
		return digits;
	}
	
}
