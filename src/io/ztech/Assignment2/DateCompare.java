package io.ztech.Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(DateCompare.class.getName());
		logger.log(Level.INFO, "Enter the dates in dd-MMM-yyyy ex.10-Jul-2018");
		Scanner scanner = new Scanner(System.in);
		String strDate1 = scanner.nextLine();
		String strDate2 = scanner.nextLine();
		scanner.close();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date1 = null;
		Date date2 = null;
		try {
			// Parsing the String
			date1 = dateFormat.parse(strDate1);
			date2 = dateFormat.parse(strDate2);
			int compareResult = date1.compareTo(date2);
			if (compareResult > 0) {
				logger.log(Level.INFO, "Date1 is after Date2");
			} else if (date1.compareTo(date2) < 0) {
				logger.log(Level.INFO, "Date1 is before Date2");
			} else {
				logger.log(Level.INFO, "Date1 is equal to Date2");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.log(Level.WARNING, "Wrong Format");
		}

	}

}
