package com.lcdscreen;

import java.util.LinkedList;
import java.util.List;

public class LcdTranslater {
	
	private LcdTranslater(){
		// Private constructor
	}
	
	public static List<Integer> numberToDigits(Long number) {
		LinkedList<Integer> digits = new LinkedList<>();
		
		while (number > 0) {
			digits.push(Math.toIntExact(number % 10));
			number = number / 10;
		}
		
		return digits;
	}
	
}
