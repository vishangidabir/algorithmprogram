package com.bridgelabz;
//Java program for implementation of Insertion Sort
public class InsertionSort {							 
	 //Function to sort array using insertion sort										
	public void sorting(int[] arr) {                     
		int len = arr.length;							//Before sorting
		for(int i = 0; i<len ; i++){ 					// 8 4 1 5 9 6
			int temp = arr[i];							// 8 | 4 1 5 9 6
			int j = i-1;								// 4 8 | 1 5 9 6
			while(j>=0 && arr[j]>temp) {  				// 1 4 8 | 5 9 6             
				arr[j+1] = arr[j];						// 1 4 5 8 | 9 6				
				j--;									// 1 4 5 8 9 | 6
			}
			arr[j+1] = temp;							//Before sorting
		}                                               // 1 4 5 6 8 9
	}
	//Function to print array
	public void printArray(int[] arr) {
		int len = arr.length;
		for(int i = 0; i<len ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arr = {8, 4, 1, 5, 9, 6};
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("Before sorting");
		insertionSort.printArray(arr);
		insertionSort.sorting(arr);
		System.out.println("After sorting");
		insertionSort.printArray(arr);
	}

	
	

}
