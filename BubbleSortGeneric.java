package com.bridgelabz;

public class BubbleSortGeneric<K> {
	////Function to sort array using bubble sort using generic
	public <K extends Comparable<K>> K sorting(K[] arr) {
		K temp = null;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return temp;
	}
	// Function to print array
	public void printArray(String[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	//Main method
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();

		String[] arr = { "vish", "madhu", "priya", "ashu", "nisha" };

		System.out.println("Before sorting");
		bubbleSort.printArray(arr);

		bubbleSort.sorting(arr);

		System.out.println("After sorting");
		bubbleSort.printArray(arr);
	}

}
