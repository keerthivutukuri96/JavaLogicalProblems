package myproblems;

import java.util.Scanner;

public class CountVowelsandConsonants2 {

	public static void main(String[] args) {

		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sentence = sentence.toLowerCase();
		int vowelscount = 0;
		int consonantscount = 0;
		for (int i = 0; i < sentence.length(); i++) {
			int a = sentence.charAt(i);
			if (!(a >= 97 && a <= 122)) {
				continue;
			} else if (String.valueOf(sentence.charAt(i)).matches("[aeiou]")) {

				vowelscount++;

			}

			else {
				consonantscount++;
			}
		}

		System.out.println(vowelscount);
		System.out.println(consonantscount);
	}

}
