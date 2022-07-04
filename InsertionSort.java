package com.bridgelabz;
//Java program for implementation of Insertion Sort
public class InsertionSort {							 
	 //Function to sort array using insertion sort										
	public void sorting(String [] array) {
									
		for(int i = 1; i<array.length ; i++){
			String temp = array[i];
			int j = i-1;								
			while(j >= 0 && array[j].compareTo(temp) > 0) {
				array[j+1] = array[j];
				j--;									
			}
			array[j+1] = temp;
		}                                               
	}
	//Function to print array
	public void printArray(String[] array) {
		int len = array.length;
		for(int i = 0; i<len ; i++ ) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String [] array = {"vish","madhu","priya","ashu","nisha"};
		InsertionSort insertionSort = new InsertionSort();
		
		System.out.println("Before sorting");
		insertionSort.printArray(array);
		
		insertionSort.sorting(array);
		System.out.println("After sorting");
		insertionSort.printArray(array);
	}
}
