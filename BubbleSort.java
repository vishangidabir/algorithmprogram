package com.bridgelabz;
//Java program for implementation of Bubble Sort
public class BubbleSort {
	 //Function to sort array using bubble sort
	private static void sorting(int[] arr) {
		int len = arr.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {							
			for (int j = 0; j < len - 1 - i; j++) {					
				if (arr[j] > arr[j + 1]) {							
					temp = arr[j];								
					arr[j] = arr[j + 1];							
					arr[j + 1] = temp;
				}													
			}														
		}															 
	}
	//Function to print array										
	private static void printArray(int[] arr) {						
		int len = arr.length;										
		for (int i = 0; i < len; i++) {							
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 1, 3 };
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println("Before sorting");
		BubbleSort.printArray(arr);
		BubbleSort.sorting(arr);
		System.out.println("After sorting");
		BubbleSort.printArray(arr);
	}

}
