package com.lcdscreen;
import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitalizerTest {
	
	Digitalizer instance = Digitalizer.getInstance();
	List<Integer> userNumber;
	
	@BeforeEach
	public void init() {
		userNumber = new LinkedList<>();
		userNumber.add(1);
		userNumber.add(2);
		userNumber.add(3);
		userNumber.add(4);
		userNumber.add(5);
		userNumber.add(6);
		userNumber.add(7);
		userNumber.add(8);
		userNumber.add(9);
		userNumber.add(0);
	}
	
	@Test
	public void testFirstLineValues() {
		//GIVEN
		StringBuilder result = new StringBuilder(new String());
		
		//WHEN
		for(Integer digit : userNumber) {
			result.append(instance.getFirstLineValue(digit));
		}
		//THEN
		assertEquals("    _  _     _  _  _  _  _  _ ", result.toString());
	}
	
	@Test
	public void testSecondLineValues() {
		//GIVEN
		StringBuilder result = new StringBuilder();
		
		//WHEN
		for(Integer digit : userNumber) {
			result.append(instance.getSecondLineValue(digit));
		}
		
		//THEN
		assertEquals("  | _| _||_||_ |_   ||_||_|| |", result.toString());
	}
	
	@Test
	public void testThirdLineValues() {
		//GIVEN
		StringBuilder result = new StringBuilder(new String());
		
		//WHEN
		for(Integer digit : userNumber) {
			result.append(instance.getThirdLineValue(digit));
		}
		//THEN
		assertEquals("  ||_  _|  | _||_|  ||_|  ||_|", result.toString());
	}
	
}
