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
			if ((a >= 97 && a <= 122)) {
				a++;
				output.append((char) a);
			}

		}
		System.out.println(output);
	}

}
