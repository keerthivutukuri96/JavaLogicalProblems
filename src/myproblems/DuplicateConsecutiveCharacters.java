package myproblems;

import java.util.Scanner;

public class DuplicateConsecutiveCharacters {

	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int oldtemp = 0;
		int newtemp;
		boolean isDuplicates = false;
		for (int i = 0; i < my_string.length(); i++) {

			newtemp = my_string.charAt(i);
			if (newtemp != oldtemp) {
				oldtemp = newtemp;

			} else {
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
