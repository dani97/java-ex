package java_excercise;

import java.util.Scanner;

public class StringSearch {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		int sum=0;
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				sum += input.charAt(i)-'0';
			}
		}
		
		System.out.println(sum);
	}
}
