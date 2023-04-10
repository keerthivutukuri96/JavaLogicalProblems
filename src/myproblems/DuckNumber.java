package myproblems;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {

		System.out.println("Please Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		boolean zerocount = false;

		while (num != 0) {

			if (num % 10 == 0) {
				zerocount = true;
				break;
			}
			num = num / 10;
		}

		if (zerocount) {
			System.out.println("It is a DuckNumber");

		} else {
			System.out.println("It is Not a DuckNumber");
		}
		sc.close();
	}

}
