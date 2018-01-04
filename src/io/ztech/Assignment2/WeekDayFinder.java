package io.ztech.Assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeekDayFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = Logger.getLogger(WeekDayFinder.class.getName());
		logger.log(Level.INFO, "Enter the dates in dd-MMM-yyyy ex.10-Jul-2018");
		Scanner scanner = new Scanner(System.in);
		String strBDay = scanner.nextLine();
		scanner.close();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date bDay = null;
		try {
			// Parsing the String
			bDay = dateFormat.parse(strBDay);
			SimpleDateFormat weekFormat = new SimpleDateFormat("EEEE");
			logger.log(Level.INFO, weekFormat.format(bDay));
			Calendar calender = Calendar.getInstance();
			calender.setTime(bDay);
			logger.log(Level.INFO, Integer.toString(calender.get(Calendar.DAY_OF_WEEK)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.log(Level.WARNING, "Wrong Format");
		}

	}

}
