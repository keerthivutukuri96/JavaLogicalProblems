package myproblems;

import java.util.Scanner;

public class MultiplesSum {

	public static void main(String[] args) {
		int multiple_sum=0;
		System.out.println("Enter a Number:");
		Scanner scanner = new Scanner(System.in);
		int digit, num = scanner.nextInt();
		while (num != 0) {
			digit = num % 10;
			if(digit%3 ==0) {
			//if(digit == 3 || digit == 6 || digit == 9){
				multiple_sum = multiple_sum + digit;
			}
			num = num / 10;
	}
		System.out.print("Sum of multiple of three Numbers : " + multiple_sum);
		scanner.close();
	}

}
