package myproblems;

import java.util.Scanner;

public class ReplacewithNextChar {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String myword = sc.nextLine();

		StringBuffer output = new StringBuffer();
		myword = myword.toLowerCase();
		for (int i = 0; i < myword.length(); i++) {
			if (myword.charAt(i) == ' ') {
				output.append(' ');
			}
			int a = myword.charAt(i);

			char c = '\0';

			if ((a >= 97 && a <= 122)) {
				a++;
				c = (char) a;
				output.append(c);

			}

		}
		System.out.println(output);
	}

}
