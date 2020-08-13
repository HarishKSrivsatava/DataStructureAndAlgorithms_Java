package org.harish.algorithms.sorting;

/* This follows the incremental approach paradigm.
   
*/
public class InsertionSort {

   public void insertSort(int[] arr){
	   for(int j = 1; j < arr.length ; j++){
		   int key = arr[j];
		   //Insert this key in the sorted sequence arr[0....j-1]
		   int i = j-1;
		   while(i >= 0 && arr[i] > key){
			   arr[i+1] = arr[i];
			   i = i-1;
		   }
		   arr[i+1] = key;
	   }
   }
	
	public void print(int[] arr){
		System.out.print("[");
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i <= arr.length-2){
				System.out.print(",");
			}
			
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		int[] arr = new int[]{3,7,1,6,9,2,99,2,-3,4};
	    InsertionSort insertSortObj = new InsertionSort();
	    insertSortObj.print(arr);
	    System.out.println(" ");
	    insertSortObj.insertSort(arr);
	    insertSortObj.print(arr);
	}
}
