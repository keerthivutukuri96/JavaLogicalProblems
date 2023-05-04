package myproblems;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		StringBuffer sentence2  = new StringBuffer();
		sentence = sentence.toLowerCase();
		System.out.println(sentence.replaceAll("[aeiou]", ""));
		// System.out.println(sentence2);
		for (int i = 0; i < sentence.length(); i++) {

			if ((sentence.charAt(i) != 'a') && (sentence.charAt(i) != 'e') && (sentence.charAt(i) != 'i')
					&& (sentence.charAt(i) != 'o') && (sentence.charAt(i) != 'u')) {
				sentence2.append(sentence.charAt(i));
			}

//			if ((Character.compare('a', sentence.charAt(i)) != 0) && (Character.compare('e', sentence.charAt(i)) != 0)
//					&& (Character.compare('i', sentence.charAt(i)) != 0)
//					&& (Character.compare('o', sentence.charAt(i)) != 0)
//					&& (Character.compare('u', sentence.charAt(i)) != 0)) {
//				sentence2 += sentence.charAt(i);
//			}
		 
		}
		 System.out.println(sentence2);
	}

}
