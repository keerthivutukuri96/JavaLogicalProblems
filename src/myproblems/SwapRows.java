package myproblems;

import java.util.Scanner;

public class SwapRows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();

		int[][] myarray = new int[rows][columns];
		int temp;

		System.out.println("Enter the number of rows you want to swap");
		int row1 = sc.nextInt();
		int row2 = sc.nextInt();

		System.out.println("Enter your elements in a matrix");
		// reading user array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				myarray[i][j] = sc.nextInt();
			}
		}

		// printing user read array
		for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < myarray[i].length; j++) {
				System.out.print(myarray[i][j] + " ");
			}
			System.out.print("\n");
		}

		// swapping rows
		for (int i = 0; i < myarray[0].length; i++) {
			temp = myarray[row1 - 1][i];
			myarray[row1 - 1][i] = myarray[row2 - 1][i];
			myarray[row2 - 1][i] = temp;
		}

		System.out.print("\n");

		// Printing after swapping
		for (int i = 0; i < myarray.length; i++) {
			for (int j = 0; j < myarray[i].length; j++) {
				System.out.print(myarray[i][j] + " ");
			}
			System.out.print("\n");
		}

		sc.close();
	}
}
