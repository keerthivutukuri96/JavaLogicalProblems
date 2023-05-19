package myproblems;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		
		System.out.println("Enter your number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(cubeSum(number));
		
		
	}
	public static int cubeSum(int num) {
		
		if(num == 0) {
			return 0;
		}
		else {
			return  powThree(num) + cubeSum(num -1);
		}
		
	}
	
	public static int powThree(int n) {
		int product = 1;
		for(int i=0;i<3;i++) {
			product = product * n;
		}
		return product;
		
	}
}
