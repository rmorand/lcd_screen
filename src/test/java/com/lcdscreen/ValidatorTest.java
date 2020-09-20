package com.lcdscreen;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatorTest {

	@Test
	public void test_positive_number() {
		//GIVEN
		String number = "0123456789";
		
		//WHEN
		boolean result = Validator.isValidNumber(number);
		
		//THEN
		assertTrue(result);
	}
	
	@Test
	public void test_negative_number() {
		//GIVEN
		String number = "-1235";
		
		//WHEN
		boolean result = Validator.isValidNumber(number);
		
		//THEN
		assertFalse(result);
	}
	
	@Test
	public void test_float_number() {
		//GIVEN
		String number = "12.35";
		
		//WHEN
		boolean result = Validator.isValidNumber(number);
		
		//THEN
		assertFalse(result);
	}
	
	@Test
	public void test_not_number() {
		//GIVEN
		String number = "bonjour";
		
		//WHEN
		boolean result = Validator.isValidNumber(number);
		
		//THEN
		assertFalse(result);
	}
	
	@Test
	public void test_mixed_cahr() {
		//GIVEN
		String number = "-12asdf35";
		
		//WHEN
		boolean result = Validator.isValidNumber(number);
		
		//THEN
		assertFalse(result);
	}
	
}
