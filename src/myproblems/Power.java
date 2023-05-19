package myproblems;

import java.util.Scanner;

public class Power {
	
	

	public static void main(String[] args) {
		System.out.println("enter your base");
		System.out.println("enter your exponent");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		System.out.println(power(base,exponent));
		sc.close();
	}
	
	public static int power(int num,int num2) {
		if(num2==0 && num != 0) {
			
			return 1;
		
		}
		else if(num2==0 && num == 0){
			
			return 0;
		}
		else {
			return num * power(num,num2-1);
		}
	}
	
}
