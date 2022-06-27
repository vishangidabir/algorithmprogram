package com.bridgelabz;

//Using generic method
public class BubbleSortGeneric<T> {

	// Function to print array
	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.print(t + " ");
		}
		System.out.print(" ");
	}

	// Function to sort array using bubble sort
	public <T extends Comparable<T>> T bubbleSort(T[] arr) {
		int len = arr.length;
		T temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return null;
	}

	// Main method
	public static void main(String[] args) {

		String[] arrayOfString = { "vish", "madhu", "priya", "ashu", "nisha" };
		BubbleSortGeneric<String> stringSorter = new BubbleSortGeneric<>();
		System.out.println("String Bubble sorting");
		System.out.println("\nBefore sorting :");
		stringSorter.printArray(arrayOfString);
		stringSorter.bubbleSort(arrayOfString);
		System.out.println("\nAfter sorting :");
		stringSorter.printArray(arrayOfString);
		System.out.println();

		System.out.println("\nInteger Bubble sorting");
		Integer[] arrOfInteger = { 8, 4, 1, 5, 9, 6 };
		BubbleSortGeneric<Integer> integerSorter = new BubbleSortGeneric<>();
		System.out.println("\nBefore sorting :");
		integerSorter.printArray(arrOfInteger);
		integerSorter.bubbleSort(arrOfInteger);
		System.out.println("\nAfter sorting :");
		integerSorter.printArray(arrOfInteger);

	}
}
