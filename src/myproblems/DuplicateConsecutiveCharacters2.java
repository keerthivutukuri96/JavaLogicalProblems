package myproblems;

import java.util.Scanner;

public class DuplicateConsecutiveCharacters2 {

	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();

		boolean isDuplicates = false;
		for (int i = 0; i < my_string.length() - 1; i++) {
			if ((my_string.charAt(i)) == (my_string.charAt(i + 1))) {
				isDuplicates = true;
				break;
			}
		}
		if (isDuplicates) {
			System.out.println("Duplicates founded");
		} else {
			System.out.println("no duplicates");
		}
		sc.close();
	}

}
