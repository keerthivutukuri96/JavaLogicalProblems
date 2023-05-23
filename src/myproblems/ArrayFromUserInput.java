package myproblems;

import java.util.Scanner;

public class ArrayFromUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements for the array");
		for(int i=0;i<a.length;i++) {
			
			a[i] = sc.nextInt();
			
		}
		for(int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
		sc.close();
	}
}

		
