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
		int eachcube;
		if(num == 0) {
			return 0;
		}
		else {
			eachcube = num * num * num;
			return  eachcube + cubeSum(num -1);
		}
		
	}

}
