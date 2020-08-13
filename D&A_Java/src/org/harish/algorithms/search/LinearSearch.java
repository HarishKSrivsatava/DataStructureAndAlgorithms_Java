package org.harish.algorithms.search;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int valuetoFind){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == valuetoFind)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {3,7,1,6,9,2,99,2,-3,4};
		int linearSearch = linearSearch(arr, 6);
		if(linearSearch != -1)
			System.out.println("Found at position : " + (linearSearch+1));
		else 
			System.out.println("Not Found");
	}
}
