/**
 * 
 */
package com.test.numbertoword;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.test.numbertoword.exception.NegitiveNumberNotAllowed;
import com.test.numbertoword.utility.NumberToEnglishWordConverter;

/**
 * @author Dastagiri
 *
 */
public class NumberToEnglishWordTest {
	
	NumberToEnglishWordConverter numberToEnglishWordConverter = new NumberToEnglishWordConverter();

	@Test
	public void testGivenNumberZero() throws NegitiveNumberNotAllowed {
		String actualValue = numberToEnglishWordConverter.convert(0);
		assertEquals("zero",actualValue);
	}
	
	@Test(expected= NegitiveNumberNotAllowed.class)
	public void testGivenNumberIsNegitive() throws Exception{
		numberToEnglishWordConverter.convert(-1);
	}
	
	@Test
	public void testGivenNumberIsSingleDigit() throws Exception{
		String actualValue =  numberToEnglishWordConverter.convert(9);
		assertEquals("nine",actualValue);
	}
	
	@Test
	public void testGivenNumberIsLessThanTwenty() throws Exception{
		String actualValue =  numberToEnglishWordConverter.convert(19);
		assertEquals("ninteen",actualValue);
	}
	@Test
	public void testGivenNumberIsLessThanHundred() throws Exception{
		String actualValue =  numberToEnglishWordConverter.convert(99);
		assertEquals("ninty nine",actualValue);
	}
	
	@Test
	public void testGivenNumberIsGreaterThanHundred() throws Exception{
		String actualValue =  numberToEnglishWordConverter.convert(199);
		assertEquals("one hundred and ninty nine",actualValue);
	}
	
	@Test
	public void testGivenNumberIsGreaterThanThousand() throws Exception{
		String actualValue =  numberToEnglishWordConverter.convert(1990);
		assertEquals("one thousand nine hundred and ninty",actualValue);
	}
	
	@Test
	public void testGivenNumberIsGreaterThanMillion() throws Exception{
		String actualValue =  numberToEnglishWordConverter.convert(56945781);
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",actualValue);
	}
	
	

}
