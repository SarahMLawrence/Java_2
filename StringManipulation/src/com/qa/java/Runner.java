package com.qa.java;

public class Runner {

	public static void main(String[] args) {

		// --------//
		// TASK 1 //
		// -------//

		// Create two Strings where one
		// string has a value of “yesterday it was raining”
		// and the other string with a value of “today it is
		// sunny. Concatenate both values, capitalize
		// both strings and print out the result.
		// The result should be:
		// - TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING

		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny, ";
		String str3 = str2 + str1;

		System.out.println(str3.toUpperCase());

		// Now use the substring method to print out: `TODAY IT IS RAINING`
		System.out.println(str2.substring(0, 5).toUpperCase() + ", " + str1.substring(10).toUpperCase());

		// ---------//
		// TASK 2 //
		// --------//

		// When given a String, count and return how many words there are in
		// that String.

		String str4 = "Hello lady";
		int wordLength = 0;
		for (int x = 0; x < str4.length(); x++) {
			wordLength += str4.substring(x, x + 1).equals("\s") ? 1 : 0;
		}
		wordLength += wordLength > 0 ? 1 : 0;

		// System.out.println(wordLength);

		// --------//
		// TASK 3 //
		// --------//
		// When given a String, print out this String in a vertical fashion,
		// each word on a different line.
		String str5 = "Sarah";

		for (int x = 0; x < str5.length(); x++) {
			if (str5.substring(x, x + 1).equals("\s")) {
				str5 += "\n";

			} else {
				str5 += str5.substring(x, x + 1);
			}
		}
		System.out.println(str5);

		// --------//
		// TASK 4 //
		// --------//
		String str6 = "Sarah";
		String currentWord = "";

		for (int i = str4.length() - 1; 1 >= 0; i--) {
			String currentChar = str6.substring(i, i + 1);

			if (currentChar.equals(" ")) {
				System.out.print(currentChar);
				currentWord = "";
			} else {
				currentWord = currentChar + currentWord;
			}
			System.out.println(currentWord);
		}

	}

}

/*
 * 
 * NOTES
 * 
 * System.out.println(str4.replace(" ", "").length());
 * 
 * String str5 = str4.replace(" ", ""); // System.out.println(str5);
 * 
 * System.out.println(str4.length() - str5.length()); //
 * System.out.println("There are " + (str4.length() - str5.length()) + //
 * "spaces");
 * 
 * 
 * 
 * System.out.println(str4); int wordCount = 1; int str4Length = str4.length();
 * for (int i = 0; i < str4Length; i++) { if (str4.charAt(i) == ' ') {
 * wordCount++; } } System.out.println(wordCount);
 * 
 */
