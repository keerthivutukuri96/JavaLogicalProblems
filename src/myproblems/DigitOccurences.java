package myproblems;

import java.util.Scanner;

public class DigitOccurences {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();
		System.out.println("Enter your digit");
		int digit  = scanner.nextInt(); 
		int remainder;
		int count = 0;
		
		if(num == 0 && digit ==0) 
			count = 1;
		while(num!=0) {
			remainder = num % 10;
			
			if(digit == remainder) {
				count++;
			}
			num = num/10;
		}
		
		System.out.println("Total number of digits in your number " + count);
	}

}
