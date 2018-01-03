package io.ztech.MyJavaAssignments;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SquirrelCigars {
	public static void main(String[] args) {
		int cigars;
		Logger logger = Logger.getLogger(SquirrelCigars.class.getName());

		Scanner sc = new Scanner(System.in);
		logger.log(Level.INFO, "enter 1 for weekend else 0");
		int weekend = 0;
		String successMsg = "party successful";
		String notSuccessMsg = "party not successful";
		try {
			weekend = sc.nextInt();
			logger.log(Level.INFO, "enter number of Cigars");
			cigars = sc.nextInt();
			if (weekend == 1) {
				if (cigars >= 40) {
					logger.log(Level.INFO, successMsg);
				} else {
					logger.log(Level.INFO, notSuccessMsg);
				}
			} else if (weekend == 0) {
				if (cigars >= 40 && cigars <= 60) {
					logger.log(Level.INFO, successMsg);
				} else {
					logger.log(Level.INFO, notSuccessMsg);

				}
			} else {
				logger.log(Level.WARNING, "wrong input");

			}
			sc.close();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Please provide a valid input");
		}

	}
}
