package myproblems;

import java.util.Scanner;

public class CheckOrder2 {

	public static void main(String args[]) {
		System.out.println("Enter Your String");

		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		int oldtemp = 0;
		int newtemp;
		boolean inOrder = true;
		for (int i = 0; i < my_string.length(); i++) {

			newtemp = my_string.charAt(i);
			if (newtemp >= oldtemp) {
				oldtemp = newtemp;
				continue;
			} else {
				inOrder = false;
				break;
			}

		}

		if (inOrder) {
			System.out.println("In order");
		} else {
			System.out.println("not in order");
		}
		sc.close();
	}
}
