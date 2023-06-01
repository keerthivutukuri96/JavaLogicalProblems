package myproblems;

import java.lang.reflect.Array;

public class MinandMax {

	public static void main(String[] args) {
		
		int a[] = {20,3,70,45,4,125}; 
		int min = a[0];
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if(a[i] > max)
			{
				max = a[i];
			}
			else if(a[i]<min)
			{
				min = a[i];
			}else
			{
				
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
