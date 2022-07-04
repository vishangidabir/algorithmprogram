package com.bridgelabz;
//Java program for implementation of Bubble Sort
public class BubbleSort {
	 //Function to sort array using bubble sort
	static void sorting(String[] array) {
		
		String temp;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length- i-1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}													
			}														
		}														
	}
	//Function to print array										
	static void printArray(String[] array) {
												
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	//Main method
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		
		String [] array = { "vish", "madhu", "priya", "ashu", "nisha" };
		
		System.out.println("Before sorting");
		BubbleSort.printArray(array);
		
		BubbleSort.sorting(array);
		
		System.out.println("After sorting");
		BubbleSort.printArray(array);
	}

}
