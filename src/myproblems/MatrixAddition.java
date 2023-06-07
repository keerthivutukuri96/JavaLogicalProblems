//package myproblems;
//
//import java.util.Scanner;
//
//public class MatrixAddition {
//
//	public static void main(String[] args) {
//	
//		int myarray1[][] = readArray();
//		int myarray2[][] = readArray();
//		int last[][] = new int[myarray1.length][myarray1[0].length];
//		
//		for(int i=0;i<myarray1.length;i++) {
//			for(int j=0;j<myarray1[i].length;j++) {
//				last[i][j] = myarray1[i][j] + myarray2[i][j];
//			}
//		}
//		 printingArray(last);
//		
//	}
//	public int[][] readArray(){
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of rows");
//		int rows=sc.nextInt();
//		System.out.println("Enter number of columns");
//		int columns = sc.nextInt();
//		int[][] myarray = new int[rows][columns];
//		
//		System.out.println("Enter your elements in a row");
//		
//			for(int i=0;i<rows;i++) {
//				for(int j=0;j<columns;j++) {
//					
//					myarray[i][j] =sc.nextInt(); 
//				}
//			}
//			
//			return myarray;
//		
//	}
//	
//	public void printingArray(int[][] myarray) {
//		for(int i=0;i<myarray.length;i++) {
//			
//			for(int j=0; j<myarray[i].length;j++) {
//				System.out.print(myarray[i][j] + " ");
//				
//			}
//			System.out.print("\n");
//		}
//		
//	}
//	
//
//}
