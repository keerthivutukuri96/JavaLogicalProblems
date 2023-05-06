package myproblems;

import java.util.Scanner;

public class AddDuplicates {

	public static void main(String[] args) {

		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String duplicates = "";
		for (int i = 0; i < sentence.length(); i++) {

			if ((sentence.charAt(i) == ' ') || (sentence.charAt(i) == '!') || (sentence.charAt(i) == '.')) {
				duplicates += sentence.charAt(i);
				
			}
			else {
			for (int j = 1; j <= 2; j++) {
				duplicates += sentence.charAt(i);

			}
			}
		}
		System.out.println(duplicates);
	}

}
