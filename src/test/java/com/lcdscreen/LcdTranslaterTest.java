package com.lcdscreen;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class LcdTranslaterTest {
	
	@Test
	public void numberToDigit_9(){
		//GIVEN
		Long numberToTranslate = 9l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(9, result.get(0));
	}
	
	@Test
	public void numberToDigit_8(){
		//GIVEN
		Long numberToTranslate = 8l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(8, result.get(0));
	}
	
	@Test
	public void numberToDigit_7(){
		//GIVEN
		Long numberToTranslate = 7l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(7, result.get(0));
	}
	
	@Test
	public void numberToDigit_6(){
		//GIVEN
		Long numberToTranslate = 6l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(6, result.get(0));
	}
	
	@Test
	public void numberToDigit_5(){
		//GIVEN
		Long numberToTranslate = 5l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(5, result.get(0));
	}
	
	@Test
	public void numberToDigit_4(){
		//GIVEN
		Long numberToTranslate = 4l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(4, result.get(0));
	}
	
	@Test
	public void numberToDigit_3(){
		//GIVEN
		Long numberToTranslate = 3l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(3, result.get(0));
	}
	
	@Test
	public void numberToDigit_2(){
		//GIVEN
		Long numberToTranslate = 2l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(1, result.size());
		assertEquals(2, result.get(0));
	}
	
	@Test
	public void numberToDigit_1(){
		//GIVEN
		Long numberToTranslate = 1l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
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
		Long numberToTranslate = 0l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
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
		Long numberToTranslate = 10000l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
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
		Long numberToTranslate = 01000l;
		
		//When
		List<Integer> result = LcdTranslater.numberToDigits(numberToTranslate);
		
		//THEN
		assertEquals(5, result.size());
		assertEquals(0, result.get(0));
		assertEquals(1, result.get(1));
		assertEquals(0, result.get(2));
		assertEquals(0, result.get(3));
		assertEquals(0, result.get(4));
	}

}
