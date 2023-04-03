package myproblems;

//import java.io.InputStream;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;

		System.out.println("Enter a year to Know leap or not");
		try (Scanner sc = new Scanner(System.in)) {
			year = sc.nextInt();
			if (year >= 0) {

				if (year % 4 == 0) {

					if ((year % 100 == 0) && (year % 400 != 0)) {
						System.out.println("I am not a leap Year");

					} else {
						System.out.println("I am a leap year");
					}
				} else {

					System.out.println("I am not a Leap Year");
				}
			} else {
				
				System.out.println("please enter a number within a range");
			}
		} catch (Exception e) {
			System.out.println("Enter a year");
		}

	}

}
