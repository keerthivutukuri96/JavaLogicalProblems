package myproblems;

import java.util.Scanner;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int vowelscount = 0;
		int consonantscount = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) == ' ') || (sentence.charAt(i) == '!') || (sentence.charAt(i) == '.')) {
				continue;

			} else if ((sentence.charAt(i) == 'a') || (sentence.charAt(i) == 'e') || (sentence.charAt(i) == 'i')
					|| (sentence.charAt(i) == 'o') || (sentence.charAt(i) == 'u')) {

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
