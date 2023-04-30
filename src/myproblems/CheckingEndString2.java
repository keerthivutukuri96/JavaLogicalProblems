package myproblems;

import java.util.Scanner;

public class CheckingEndString2 {

	public static void main(String[] args) {

		System.out.println("Enter string1");
		System.out.println("Enter String2");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int i = 0;
		boolean isEqual = true;
		while(s2.length()-1-i >= 0) {
			
			if( Character.compare (s2.charAt(s2.length()-1-i), s1.charAt(s1.length()-1-i)) != 0 ) //enter if  character not equals
			{	
				
				isEqual = false;
				break;
			}
			
			
				
			i++;
			
		}
		if(isEqual) {
			System.out.println("Matched");
		}else
			System.out.println("not a match");
	}

}
