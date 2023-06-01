package myproblems;

import java.util.Scanner;

public class PrintlastMElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements for the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("enter the number of last elements to display");
		int m = sc.nextInt();
		if(m<n) {
		for(int i=n-m; i<n; i++) {
			
			System.out.println(a[i]);
		}
		}else {
			System.out.println("Enter a valid  input");
		}
		sc.close();
	}
}


