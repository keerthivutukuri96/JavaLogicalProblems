package myproblems;

import java.util.Scanner;

public class SumOfEvenInaArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int evensum =0 ;
		System.out.println("enter the elements for array");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
			
		}
		for(int i=0 ;i < a.length;i++) {
			
			if(a[i]%2 == 0) {
				
				
				evensum = evensum + a[i];
	
			}
		}
		System.out.println(evensum);
	}

}
