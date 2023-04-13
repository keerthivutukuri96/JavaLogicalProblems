package myproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    System.out.println("Enter your series");
		Scanner sc = new Scanner(System.in);
		int fib =  sc.nextInt();
	    myNumbers.add(0 , 0);
	    myNumbers.add(1 , 1);
	  
	    for(int i = 2; i<fib;i++) {
	    	myNumbers.add(i ,myNumbers.get(i-2) + myNumbers.get(i-1));
	    	
	    }
	    
	    for(int j = 0;j<myNumbers.size(); j++) {
		    System.out.print(myNumbers.get(j) + " ");

	    }
	    sc.close();
	}

}
