package myproblems;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		Scanner sc = new Scanner(System.in);
		String mysentence = sc.nextLine();
		System.out.println(mysentence.split(" ").length);
		int count = 0;
		for(int i=0;i<mysentence.length(); i++) {
			//System.out.println(Character.isWhitespace(mysentence.charAt(i)));
			if(Character.isWhitespace(mysentence.charAt(i))||mysentence.charAt(i)=='.') 
				count++;
			}
			
		count++;
		System.out.println(count);
		sc.close();
	}
}
