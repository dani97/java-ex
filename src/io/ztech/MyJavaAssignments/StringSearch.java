package io.ztech.MyJavaAssignments;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logger logger = Logger.getLogger(StringSearch.class.getName());
		logger.log(Level.INFO, "enter input string");
		String input = sc.nextLine();
		sc.close();
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				sum += input.charAt(i) - '0';
			}
		}

		logger.log(Level.INFO, Integer.toString(sum));
	}
}
