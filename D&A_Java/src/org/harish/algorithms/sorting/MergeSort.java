package org.harish.algorithms.sorting;

public class MergeSort {

	public void mergeSort(int[] arr, int startIndex, int endIndex){
		if(startIndex < endIndex){
			int middleIndex = (startIndex + endIndex) /2; 
			mergeSort(arr,startIndex,middleIndex); 
			mergeSort(arr,middleIndex+1,endIndex); 
			merge(arr,startIndex,middleIndex,endIndex);
		}
	}
	
	private void merge(int[] arr, int startIndex, int middleIndex, int endIndex) {
		// Create two arrays.
		int n1 = middleIndex - startIndex + 1;
		int n2 = endIndex - middleIndex;
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		// fill up these two arrays
		for(int i = 0; i < n1; ++i){
			leftArr[i] = arr[startIndex + i];
		}
		for(int i = 0; i < n2; ++i){
			rightArr[i] = arr[middleIndex + 1 + i];
		}
		int i = 0;
		int j = 0;
		/*for(int k = startIndex ; k < endIndex ; k++){
			if(leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i = i +1;
			}else{
				arr[k] = rightArr[j];
				j = j + 1;
			}
		}*/
		int k = startIndex;
		while(i < n1 && j < n2){
			if(leftArr[i] <= rightArr[j]){
				arr[k] = leftArr[i];
				i = i +1;
			}else{
				arr[k] = rightArr[j];
				j = j + 1;
			}
			k++;
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
		int[] arr = new int[] {3,7,1};
		int startIndex = 0;
		int endIndex = arr.length - 1; //2
		MergeSort mergeSortObj = new MergeSort();
		mergeSortObj.print(arr);
		System.out.println("");
		mergeSortObj.mergeSort(arr, startIndex, endIndex);
		mergeSortObj.print(arr);
	}
}
