package myproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitsOrder {

	public static void main(String[] args) {

		int num;
		try {
		System.out.println("Enter Your Number");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
//		
//		for(int i = 0; i<1000;i++) {
//		System.out.println(num%10);
//		num=num/10;
//		if(num < 10) break;
//	}

		//int num  = 98732576;
		ArrayList<Integer> digits = new ArrayList<Integer>();   
		if(num<0) {
			num = num * -1;
		}
		while(num>9) {
			digits.add(num%10);
			num=num/10;
		}		
		digits.add(num);
		//For Reverse Printing
//		 for (int i : digits) {
//		      System.out.println(i);
//		    }
		//For Normal Printing
		for(int i=digits.size()-1; i>=0; i--) {
		      System.out.println(digits.get(i));

		}
		}catch(Exception e) {
			System.out.println("Enter integer value only");
		}

}
}
