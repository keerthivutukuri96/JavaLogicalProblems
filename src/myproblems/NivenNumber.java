package myproblems;

import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		System.out.println("Please Enter Your");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println((num % sum(num) == 0) ? "Niven Number" : "Not a Niven Number");

		sc.close();

	}

	private static int sum(int num) {
		int digit, sum = 0;
		while (num != 0) {
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}

		return sum;
	}
}
