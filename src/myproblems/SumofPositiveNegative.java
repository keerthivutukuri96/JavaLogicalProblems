package myproblems;

import java.util.Scanner;

public class SumofPositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		int positivesum =0 ;
		int negativesum =0 ;
		System.out.println("enter the elements for array");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
			
		}
		for(int i=0 ;i < a.length;i++) {
			
			if(a[i]>=0) {
				
				
				positivesum += a[i];
	
			}else {
				
				negativesum += a[i];
			}
		}
		System.out.println("Sum of positive: " + positivesum);
		System.out.println("Sum of negative: " + negativesum);
		sc.close();
	}
	
}
