package myproblems;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//Reading number from the user
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		//finding factors of the given number and adding them
		int result=0;
		
		//handling the case where number is less than 1
		if(number<=0) {
			System.out.println("Please enter number greater than zero");
			System.exit(0);
		}
		//handling the case where number is 1 
		if(number == 1)
			result =1;
		
		for(int i=1;i<=number/2;i++) {
			if(number%i == 0) 
				result += i;
		}
		//System.out.println(result);
		
		
		//checking if perfect number 
		if(result == number) 
			System.out.println(number +" is  a perfect number");
		else
			System.out.println(number +" is not a perfect number");
		
		sc.close();
	}

}
