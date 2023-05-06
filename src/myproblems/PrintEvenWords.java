package myproblems;

import java.util.Scanner;

public class PrintEvenWords {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sentence += " ";
		StringBuffer output = new StringBuffer();
		String evenLengthWords = "";
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {

				if (output.length() % 2 == 0) {
					evenLengthWords += output;
					evenLengthWords += " ";

				}
				output.delete(0, output.length());

			} else {
				output.append(sentence.charAt(i));
			}
		}
		System.out.println(evenLengthWords);
	}

}
