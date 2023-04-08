package myproblems;

import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {
		
		int prime_sum = 0;
	
		System.out.println("Enter a Number:");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		while (num != 0) {
			digit = num % 10;		
			if(digit == 2 || digit == 3 || digit == 5 || digit == 7) {
				prime_sum = prime_sum + digit;
			}
				num = num / 10;
		}
		System.out.print("Sum of Prime Numbers : " + prime_sum);
		
	}

}
