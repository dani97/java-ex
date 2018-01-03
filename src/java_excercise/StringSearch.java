package java_excercise;

import java.util.Scanner;

public class StringSearch {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String [] a = input.split("\\D");
		System.out.println(a.length);
		int sum = 0;
		for (String i : a) {
			try {
			sum+=Integer.parseInt(i);
			}
			catch(java.lang.NumberFormatException e) {
				
			}
		}
		
		System.out.println(sum);
	}
}
