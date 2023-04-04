package myproblems;

import java.util.Scanner;

public class CreditScore {

	public static void main(String[] args) {
		int score = -2000;
		System.out.println("Enter Your Score");
		try {
			Scanner sc = new Scanner(System.in);
			score = sc.nextInt();
			if ((score >= 400) && (score < 600)) {
				System.out.println("you are eligible for a silver card");
			} else if ((score >= 600) && (score < 800)) {
				System.out.println("You are eligible for a gold card");
			}

			else if ((score >= 800) && (score < 850)) {
				System.out.println("you are eligible for a platinum card");
			} else if (((score >= 0) && (score < 400)) || (score > 850)) {

				System.out.println("You are not eligible for a card");
			}

			else {

				System.out.println("Invalid Score");
			}
		} catch (Exception e) {
			System.out.println("Please Enter Your Credit Score");
		}
	}

}
