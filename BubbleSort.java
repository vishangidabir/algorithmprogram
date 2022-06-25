package com.bridgelabz;
//Java program for implementation of Bubble Sort
public class BubbleSort {
	 //Function to sort array using bubble sort
	private static void sorting(int[] arr) {
		int len = arr.length;
		int temp;
		for (int i = 0; i < len - 1; i++) {							//5 2 4 1 3
			for (int j = 0; j < len - 1 - i; j++) {					//2 5 4 1 3
				if (arr[j] > arr[j + 1]) {							//2 4 5 1 3
					temp = arr[j];									//2 4 1 5 3
					arr[j] = arr[j + 1];							//2 4 1 3 5
					arr[j + 1] = temp;
				}													//2 4 1 3
			}														//2 1 4 3
		}															//2 1 3 4 
	}
	//Function to print array										//2 1 3 
	private static void printArray(int[] arr) {						//1 2 3
		int len = arr.length;										
		for (int i = 0; i < len; i++) {								//1 2
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
