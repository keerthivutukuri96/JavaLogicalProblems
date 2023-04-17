package myproblems;
import java.util.Scanner;

public class NivenNumber {

	public static void main(String[] args) {
		System.out.println("Please Enter Your");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		int digit, sum = 0;
		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			sum = sum + digit;

		}
		if (number % sum == 0) {
			System.out.println("I am a Niven Number");
		} else {
			System.out.println("I am not a Niven Number");
		}
		sc.close();
	}

}
