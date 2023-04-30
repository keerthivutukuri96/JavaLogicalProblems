package myproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurencesString {

	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int count = 0;
		HashMap<String, Integer> hash_map = new HashMap<String,Integer>();
		for (int outer = 0; outer < s1.length(); outer++) {
			count = 0;
			if(hash_map.containsKey(s1.charAt(outer))) {
				break;
			}
			for (int inner = 0; inner < s1.length(); inner++) {
				if (s1.charAt(inner) == s1.charAt(outer)) {
					count++;
				}
			}
			
			String s=String.valueOf(s1.charAt(outer));
			hash_map.put(s, count);
			//System.out.println(count);
			
		}
		
		//System.out.println(hash_map);
		Iterator<HashMap.Entry<String, Integer>> iterator = hash_map.entrySet().iterator();
		
		int finalvalue = -20;
		String finalkey = "$";
		while(iterator.hasNext()) {
			HashMap.Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			if (!key.equals(" "))
			if(value > finalvalue) {
				finalvalue = value;
				finalkey = key;
			}
			
		}
		System.out.println(finalkey  + ": " + finalvalue);
	}

}
