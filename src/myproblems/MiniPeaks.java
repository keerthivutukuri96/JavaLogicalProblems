package myproblems;

public class MiniPeaks {

	public static void main(String[] args) {
		
		int[] arr  = {1, 5, 4, 2, 26, 21};
		
		for(int i=0;i<arr.length;i++) {
			
			if(i == 0) 
				if(arr[i] > arr[i+1]) 
					System.out.println(arr[i]);
			
			if(i>0 && i<arr.length-1)
			if(arr[i] > arr[i+1] && arr[i] > arr[i-1]) {
				System.out.println(arr[i]);
			}
			
			if (i == arr.length-1)
				if(arr[i]>arr[i-1]) 
					System.out.println(arr[i]);
				
			
		}
	}

}
