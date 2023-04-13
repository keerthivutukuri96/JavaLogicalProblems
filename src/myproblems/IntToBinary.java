package myproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class IntToBinary {

	public static void main(String[] args) {
		
		int digit ,total =0 ;
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();

		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num!=0) {
			digit = num%2;
			myNumbers.add(digit);
			//System.out.println(digit);
			num = num/2;
			
		}
		for(int i=(myNumbers.size()-1); i>=0; i--) {
			System.out.print(myNumbers.get(i));
		}
		sc.close();
		
	}

}
