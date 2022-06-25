package com.bridgelabz;
//Java program for implementation of Insertion Sort
public class InsertionSort {							 
	 //Function to sort array using insertion sort										
	public void sorting(int[] arr) {                     
		int len = arr.length;							
		for(int i = 0; i<len ; i++){ 				
			int temp = arr[i];							
			int j = i-1;								
			while(j>=0 && arr[j]>temp) {  				           
				arr[j+1] = arr[j];										
				j--;									
			}
			arr[j+1] = temp;							
		}                                              
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
