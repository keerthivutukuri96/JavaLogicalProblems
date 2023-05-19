package myproblems;

import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fact(num));
		sc.close();
	}
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}else {
			return n * fact(n-1);
		}
	}
	
}
