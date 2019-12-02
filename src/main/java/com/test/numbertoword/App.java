package com.test.numbertoword;

import java.util.Scanner;

import com.test.numbertoword.utility.NumberToEnglishWordConverter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the number to convert");
			int number = sc.nextInt();
			NumberToEnglishWordConverter numberToEnglishConverter = new NumberToEnglishWordConverter();
			System.out.println(numberToEnglishConverter.convert(number));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != sc)
				sc.close();
		}

	}
}
