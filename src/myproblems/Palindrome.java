package myproblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int digit,result =0 ;
		
		System.out.println("Please Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		while(num!=0) {
			digit = num%10;
			result = result * 10 +digit;
			num = num/10;
		}
		
		//System.out.println(result);
		if(result == number) {
			System.out.println("The number you entered is a palindrome");
		}else {
			System.out.println("The number you entered is not a palindrome");
		}
		sc.close();
	}
	
}
