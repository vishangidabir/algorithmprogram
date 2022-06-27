package com.bridgelabz;
//Java program for implementation of Insertion Sort
public class InsertionSort {							 
	 //Function to sort array using insertion sort										
	public void sorting(String [] arr) {                     
									
		for(int i = 1; i<arr.length ; i++){ 					
			String temp = arr[i];							
			int j = i-1;								
			while(j >= 0 && arr[j].compareTo(temp) > 0) {  				           
				arr[j+1] = arr[j];								
				j--;									
			}
			arr[j+1] = temp;						
		}                                               
	}
	//Function to print array
	public void printArray(String[] arr) {
		int len = arr.length;
		for(int i = 0; i<len ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String [] arr = {"vish","madhu","priya","ashu","nisha"};
		InsertionSort insertionSort = new InsertionSort();
		
		System.out.println("Before sorting");
		insertionSort.printArray(arr);
		
		insertionSort.sorting(arr);
		System.out.println("After sorting");
		insertionSort.printArray(arr);
	}

	
	

}
