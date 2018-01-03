package io.ztech.MyJavaAssignments;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
		Scanner scanner  = new Scanner(System.in);
		Logger logger = Logger.getLogger(Count11.class.getName());
		logger.log(Level.INFO,"enter number of elements");
		int n = scanner.nextInt();
		logger.log(Level.INFO,"enter elements");
		int [] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i] = scanner.nextInt();
		}
		logger.log(Level.INFO,Integer.toString(give11(numbers,0)));
		scanner.close();
		
	}
}
