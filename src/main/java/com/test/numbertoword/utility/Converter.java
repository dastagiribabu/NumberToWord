/**
 * 
 */
package com.test.numbertoword.utility;

import com.test.numbertoword.exception.NegitiveNumberNotAllowed;

/**
 * @author Dastagiri
 *
 */
public interface Converter {

	public static String[] ONES = { "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine",
			" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
			" ninteen" };

	public static String[] TENS = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy",
			" eighty", " ninty" };
	
	public static String[] HIGHER = { ""," thousand", " million"};

	public String convert(int number) throws NegitiveNumberNotAllowed;

}
