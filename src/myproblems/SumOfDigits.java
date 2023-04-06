package myproblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		

			System.out.println("Enter a Number:");
			Scanner scanner = new Scanner(System.in);
			int digit, num = scanner.nextInt();
			
			
			int sum = 0;

			while (num != 0) {
				digit = num % 10;
				sum = sum + digit;
				// System.out.print(digit+" ");

				num = num / 10;
			}
			System.out.println(sum);
			scanner.close();
			

	}

}
