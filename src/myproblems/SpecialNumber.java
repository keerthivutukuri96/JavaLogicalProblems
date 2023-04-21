package myproblems;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number = num;
		int digit ,result =0, mul= 1;
		while(num!=0) {
			digit = num%10;
			mul = mul * digit;
			result = result + digit;
			
			num = num/10;
			
		}
		if((mul + result) == number) {
			System.out.println("It is a special number");
		}else {
			System.out.println("Not a special Number");
		}
		
		sc.close();
	}

}
