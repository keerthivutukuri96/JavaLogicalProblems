package myproblems;

import java.util.ArrayList;
import java.util.Scanner;

/* Read an input number from the user 
 * and printing it in a reverse order */

public class ReverseaNumber {

	public static void main(String[] args) {
		int digit;
		int sum =0;
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();

		System.out.println("Please Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		Extracting each digit
		while(num!=0) {
			digit = num % 10;
			myNumbers.add(digit);
			num =num/10;
		}
		
//		for(int i=0;i<myNumbers.size();i++) {
//			System.out.println(myNumbers.get(i));
//		}
		
// 		Extracting each digit from an arraylist and Constructing a Reverse number
		for(int i=0;i<myNumbers.size();i++) {
			sum = sum * 10 + myNumbers.get(i) ;
		}
		
		System.out.println("Reversed number is " +sum);		
	}
	

}
