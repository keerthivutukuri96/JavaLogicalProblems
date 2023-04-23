package myproblems;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num = number;
		int sum = 0,digit;
		while(number!=0) {
			digit = number%10;
			sum += (digit * digit * digit);
			number = number/10;
		}
		if(num == sum)
			System.out.println("It is a ArmStrong number");
		else
			System.out.println("It is not a ArmStrong number");
	}

}
