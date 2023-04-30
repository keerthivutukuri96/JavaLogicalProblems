package myproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindGold {

	public static void main(String[] args) {
		
		System.out.println("enter your sentence");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line += '\n';
		String temp = "";
		List<String> list=new ArrayList<String>();  
		boolean isFound = false;
		for(int i =0;i<line.length();i++) {
			
			if(Character.isWhitespace(line.charAt(i))||line.charAt(i)=='.'||line.charAt(i)=='\n') {
				list.add(temp);
				//System.out.println(temp);
				
				if(temp.equals("gold")) {
					isFound = true;
					break;
				}
				
				temp = "";
			}
			else {
				temp += line.charAt(i);
			}
			
		}
		if(isFound) {
			System.out.println("found gold");
		}
		else {
			System.out.println("not found");
		}
		
		
	}

}
