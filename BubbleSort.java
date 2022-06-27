package com.bridgelabz;
//Java program for implementation of Bubble Sort
public class BubbleSort {
	 //Function to sort array using bubble sort
	static void sorting(String[] arr) {
		
		String temp;
		for (int i = 0; i < arr.length-1; i++) {							
			for (int j = 0; j < arr.length- i-1; j++) {					
				if (arr[j].compareTo(arr[j + 1]) > 0) {							
					temp = arr[j];									
					arr[j] = arr[j + 1];							
					arr[j + 1] = temp;
				}													
			}														
		}														
	}
	//Function to print array										
	static void printArray(String[] arr) {						
												
		for (int i = 0; i < arr.length; i++) {								
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	//Main method
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		
		String [] arr = { "vish", "madhu", "priya", "ashu", "nisha" };
		
		System.out.println("Before sorting");
		BubbleSort.printArray(arr);
		
		BubbleSort.sorting(arr);
		
		System.out.println("After sorting");
		BubbleSort.printArray(arr);
	}

}
