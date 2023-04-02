package myproblems;

import java.util.Scanner;

public class EvenOdd {


	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
		
			if (num <= 0) {
				System.out.println("Invalid Number");
			} else if (num % 2 == 0) {
				System.out.println("I am Even Number");
			} else {
				System.out.println("I am Odd Number");
			}

		}
		//sc.close();
		catch(Exception e){
		System.out.println("Please Enter an integer");
		}
	}

}
