package com.lcdscreen;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ConverterTest {
	
	@Test
	public void numberToDigit_9(){
		//GIVEN
		String numberToTranslate = "9";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(9, result.get(0));
	}
	
	@Test
	public void numberToDigit_8(){
		//GIVEN
		String numberToTranslate = "8";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(8, result.get(0));
	}
	
	@Test
	public void numberToDigit_7(){
		//GIVEN
		String numberToTranslate = "7";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(7, result.get(0));
	}
	
	@Test
	public void numberToDigit_6(){
		//GIVEN
		String numberToTranslate = "6";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(6, result.get(0));
	}
	
	@Test
	public void numberToDigit_5(){
		//GIVEN
		String numberToTranslate = "5";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(5, result.get(0));
	}
	
	@Test
	public void numberToDigit_4(){
		//GIVEN
		String numberToTranslate = "4";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(4, result.get(0));
	}
	
	@Test
	public void numberToDigit_3(){
		//GIVEN
		String numberToTranslate = "3";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(3, result.get(0));
	}
	
	@Test
	public void numberToDigit_2(){
		//GIVEN
		String numberToTranslate = "2";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(2, result.get(0));
	}
	
	@Test
	public void numberToDigit_1(){
		//GIVEN
		String numberToTranslate = "1";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(1, result.get(0));
	}
	
	/**
	 * test pour vérifier le cas spécial 0
	 */
	@Test
	public void numberToDigit_0(){
		//GIVEN
		String numberToTranslate = "0";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(0, result.get(0));
	}
	
	/**
	 * test pour vérifier un chiffre se terminant par 0
	 */
	@Test
	public void numberToDigit_10000(){
		//GIVEN
		String numberToTranslate = "10000";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(5, result.size());
		assertEquals(1, result.get(0));
		assertEquals(0, result.get(1));
		assertEquals(0, result.get(2));
		assertEquals(0, result.get(3));
		assertEquals(0, result.get(4));
	}
	
	/**
	 * test pour vérifier un chiffre commençant par 0
	 */
	@Test
	public void numberToDigit_01000(){
		//GIVEN
		String numberToTranslate = "01000";
		
		//When
		List<Integer> result = Converter.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(5, result.size());
		assertEquals(0, result.get(0));
		assertEquals(1, result.get(1));
		assertEquals(0, result.get(2));
		assertEquals(0, result.get(3));
		assertEquals(0, result.get(4));
	}

}
