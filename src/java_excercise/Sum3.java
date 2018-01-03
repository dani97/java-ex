package java_excercise;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if(a==b&& b==c) {
			System.out.println(0);
		}
		else if(a==b) {
			System.out.println(c);
		}
		else if(a==c) {
			System.out.println(b);
		}
		else if(b==c) {
			System.out.println(a);
		}
		else {
			System.out.println(a+b+c);
		}
	}

}
