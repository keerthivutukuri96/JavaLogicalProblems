package myproblems;

import java.util.Scanner;

public class CheckingEndStrings {

	public static void main(String[] args) {

		System.out.println("Enter String1");
		System.out.println("Enter String2");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		String output = "";
		String output2 = "";
		boolean isASubString = true;
		for (int i = word1.length() - 1; i >= 0; i--) {

			output += word1.charAt(i);

		}
		//System.out.println(output);
		for (int j = word2.length() - 1; j >= 0; j--) {

			output2 += word2.charAt(j);
		}
		//System.out.println(output2);

		for (int k = 0; k <= output2.length() - 1; k++) {

			if (Character.compare(output2.charAt(k), output.charAt(k)) != 0)

				isASubString = false;
			break;
		}
		if (isASubString == true)
			System.out.println("Matched");
		else
			System.out.println("Not a match");

	}

}
