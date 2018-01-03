package io.ztech.MyJavaAssignments;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Logger logger = Logger.getLogger(Sum3.class.getName());
		sc.close();
		if (a == b && b == c) {
			logger.log(Level.INFO, Integer.toString(0));
		} else if (a == b) {
			logger.log(Level.INFO, Integer.toString(c));
		} else if (a == c) {
			logger.log(Level.INFO, Integer.toString(b));
		} else if (b == c) {
			logger.log(Level.INFO, Integer.toString(a));
		} else {
			logger.log(Level.INFO, Integer.toString(a + b + c));
		}
	}

}
