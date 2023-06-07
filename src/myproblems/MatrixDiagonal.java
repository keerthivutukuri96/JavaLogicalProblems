package myproblems;

import java.util.Scanner;

public class MatrixDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();
		int arr[][] = new int[rows][columns];
		System.out.println("Enter your elements in a matrix");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			
			{
				if(i==j) {
				System.out.print(arr[i][j] + " ");
				}
				else
				{
					System.out.print("- ");
				}
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
