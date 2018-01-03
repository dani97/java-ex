package java_excercise;

import java.util.Scanner;

public class Count11 {
	public static int give11(int a[],int i) {
		if(i==a.length)
			return 0;
		if(a[i]==11) {
			return give11(a,i+1)+1;
		}
		else {
			return give11(a,i+1);
		}
	}
	
	public static void main(String [] ar) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter number of elements");
		int n = sc.nextInt();
		System.out.println("enter elements");
		int [] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(give11(numbers,0));
		sc.close();
		
	}
}
