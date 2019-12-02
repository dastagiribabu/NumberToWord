/**
 * 
 */
package com.test.numbertoword.utility;

import com.test.numbertoword.exception.NegitiveNumberNotAllowed;

/**
 * @author Dastagiri
 *
 */
public class NumberToEnglishWordConverter implements Converter {

	public String convert(int number) throws NegitiveNumberNotAllowed {
		String result = "";
		if (number < 0)
			throw new NegitiveNumberNotAllowed();

		if (number == 0) {
			return "zero";
		}
		int biggerCount = 0;
		do {
			
			int temp = number % 1000;
			if (temp != 0) {
				String belowThousand = getWordForBelowThousand(temp);
				result = belowThousand+Converter.HIGHER[biggerCount]+result; 
			}
			biggerCount++;
			number /= 1000;
			
		} while (number > 0);
	
		return result.trim();
	}

	private String getWordForBelowThousand(int belowThousandNumber) {
		String belowThousandWord = "";
		if (belowThousandNumber % 100 < 20) {
			belowThousandWord = Converter.ONES[belowThousandNumber % 100];
			belowThousandNumber /= 100;
		} else {
			
			belowThousandWord = Converter.ONES[belowThousandNumber % 10];
			belowThousandNumber /= 10;
			belowThousandWord = Converter.TENS[belowThousandNumber % 10]+belowThousandWord;
			belowThousandNumber /= 10;
		}
		if(belowThousandNumber >0)
			belowThousandWord = Converter.ONES[belowThousandNumber % 10]+" hundred and"+ belowThousandWord;
		return belowThousandWord;
	}

}
