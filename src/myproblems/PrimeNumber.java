package myproblems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("enter your range");
		System.out.println("enter n1 value");
		System.out.println("enter n2 value");
		Scanner sc = new Scanner(System.in);
		// Reading numbers from user
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		// checking prime or not between the range n1 and n2
		// prime check function invokes everytime
		for (int i = n1; i <= n2; i++) {
			if (primeCheck(i)) {
				System.out.print(i + " ");
			}
		}
	}

	// checking each number is whether prime or not and returns true or false
	public static boolean primeCheck(int n1) {
		boolean isPrime = true;
		if (n1 % 2 == 0) {
			isPrime = false;
		} else {
			for (int i = 3; i <= n1 / 2; i = i + 2) {

				if (n1 % i == 0)
					isPrime = false;

			}
		}
		return isPrime;
	}

}
