package myproblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
			int choice;
			System.out.println("Enter a Number:");
			Scanner scanner = new Scanner(System.in);
			int digit, num = scanner.nextInt();
			System.out.println("For Even Enter 1 , For Odd Enter 2");
			choice = scanner.nextInt();
			
			

			int even = 0;
			int odd = 0;
			while (num != 0) {
				digit = num % 10;		
				if(digit%2 == 0) {
					even = even + digit;
				}
				else {
						odd = odd + digit;
					}
					num = num / 10;
			}
			if(choice == 1) System.out.println("Sum of Even Numbers: " + even);
			else System.out.println("Sum of Odd Number: " +odd);
			scanner.close();
			

	}

}
