package myproblems;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String input_string = sc.next();
		String output_string = "";
		for (int i = input_string.length() - 1; i >= 0; i--) {
			output_string += input_string.charAt(i);
		}
		System.out.println(input_string.equals(output_string)?"Palindrome":"Not a palindrome");
	}

}

