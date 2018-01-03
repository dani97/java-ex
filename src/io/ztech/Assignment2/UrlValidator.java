package io.ztech.Assignment2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UrlValidator {
	public static boolean validateUrl(String url) {
		return url.matches("[a-zA-Z]+://(www.)?[a-zA-Z0-9]+[.][a-zA-Z]+$");
	}
	
	public static String replaceHtmlTags(String html) {
		return html.replaceAll("<[a-zA-Z -//]+>", "");
	}

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(UrlValidator.class.getName());
		logger.log(Level.INFO, "enter url");
		Scanner scanner = new Scanner(System.in);
		String url = scanner.nextLine();
		logger.log(Level.INFO, Boolean.toString(validateUrl(url)));
		String html = scanner.nextLine();
		logger.log(Level.INFO, replaceHtmlTags(html));
		scanner.close();
	}
}
