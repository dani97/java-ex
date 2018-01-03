package java_excercise;

import java.util.Scanner;

public class SquirrelCigars {
	public static void main(String [] args) {
		int cigars;
		System.out.println("enter details of party ");
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter 1 for weekend else 0");
		int weekend = sc.nextInt();
		cigars = sc.nextInt();
		if(weekend==1) {
			if(cigars>=40) {
				System.out.println("party successful");
			}
			else {
				System.out.println("party not successful");
			}
		}
		else {
			if(cigars>=40 && cigars<=60) {
				System.out.println("party successful");
			}
			else {
				System.out.println("party not successful");

			}
		}
		sc.close();
	}
}
