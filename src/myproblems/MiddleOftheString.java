package myproblems;

import java.util.Scanner;

public class MiddleOftheString {

	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String my_word = sc .nextLine();
		
		if((my_word.length()%2) == 0) {
		
			int index = my_word.length()/2;
			char a = my_word.charAt(index);
			char b = my_word.charAt(index-1);
			System.out.println(my_word.substring(my_word.length()/2-1,my_word.length()/2+1));
			//System.out.println(""+b+a);
			
		}else {
			
			//System.out.println(""+my_word.charAt(my_word.length()/2));
			System.out.println(my_word.substring(my_word.length()/2,my_word.length()/2+1));
		
		}
	}

}
