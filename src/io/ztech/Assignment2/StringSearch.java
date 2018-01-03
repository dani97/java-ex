package io.ztech.Assignment2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringSearch {
	public static boolean checkString(String input, String[] stringArray) {
		for (String looper : stringArray) {
			if (looper.equals(input)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Logger logger = Logger.getLogger(StringSearch.class.getName());
		logger.log(Level.INFO, "enter number of strings");
		int numStrings = scanner.nextInt();
		scanner.nextLine();
		logger.log(Level.INFO, "enter all the strings");
		String[] stringArray = new String[numStrings];
		for (int i = 0; i < numStrings; i++) {
			stringArray[i] = scanner.nextLine();
		}
		logger.log(Level.INFO,"enter input string");
		String input = scanner.nextLine();
		scanner.close();
		logger.log(Level.INFO,(checkString(input,stringArray)?"Found":"Not Found"));
	}
}
