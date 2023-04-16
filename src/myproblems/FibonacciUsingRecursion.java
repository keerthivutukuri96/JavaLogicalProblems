package myproblems;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	
	public static int fib(int num) {
		
		if(num == 0 || num == 1) {
			return num;
		}else {
			
			return  (fib(num -1) + fib(num -2));
		}
	}
	
	public static void main (String args[]) {
		
	
	System.out.println("enter your number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for(int i =0; i<num;i++) {
		System.out.print(fib(i) + " ");
	}

}
}
