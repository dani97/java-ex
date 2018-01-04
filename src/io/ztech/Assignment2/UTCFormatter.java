package io.ztech.Assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UTCFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(UTCFormatter.class.getName());
		SimpleDateFormat utcFormat = new SimpleDateFormat("EE yyyy.MM.dd 'at' h:mm:ss a z");
		utcFormat.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));
		logger.log(Level.INFO, utcFormat.format(new Date()));
	}

}
