package myproblems;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns");
		int columns = sc.nextInt();
		int[][] myarray = new int[rows][columns];
		int zerocount = 0;
		int nonzerocount = 0;
		
		System.out.println("Enter your elements in a matrix");
		
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {		 
					myarray[i][j] =sc.nextInt(); 
				}
			}
			for(int i=0;i<myarray.length;i++) {
				
				for(int j=0; j<myarray[i].length;j++) {
					//System.out.print(myarray[i][j] + " ");
					if(myarray[i][j] == 0) {
						zerocount++;
					}
					else {
						nonzerocount++;
					}
					
				}
				//System.out.print("\n");
			}
			if(zerocount > nonzerocount) {
				System.out.println("SparseMatrix");
			}
			else {
				System.out.println(" Not a SparseMatrix");
			}
			sc.close();
		
	}

}
