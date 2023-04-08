package myproblems;

import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		
		
		System.out.println("Enter a Number:");
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();
		System.out.println(" The number you entered is " + num);
		int count = 0;
		
		if(num == 0) 
			count = 1;
		while(num!=0) {
			count++;
			num = num/10;
		}
		
		System.out.println("total number of digits " + count);
		
	}

}
