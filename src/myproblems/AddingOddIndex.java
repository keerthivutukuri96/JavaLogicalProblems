package myproblems;

import java.util.Scanner;

public class AddingOddIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int oddsum=0;
		System.out.println("Enter the elements in an array");
		

		for(int i=0;i<a.length;i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		for(int i=0 ; i<a.length;i++) {
			if(i % 2 != 0) 
			{
				oddsum = oddsum + a[i];
			}
		}
		System.out.println(oddsum);
		sc.close();
	}

}
