package com.bridgelabz;

//Using generic method
public class BubbleSortGeneric<T> {

	// Function to print array
	public static <T> void printArray(T[] array) {
		for (T t : array) {
			System.out.print(t + " ");
		}
		System.out.print(" ");
	}

	// Function to sort array using bubble sort
	public <T extends Comparable<T>> T bubbleSort(T[] array) {
		int length = array.length;
		T temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return null;
	}

	// Main method
	public static void main(String[] args) {

		String[] string = { "vish", "madhu", "priya", "ashu", "nisha" };
		BubbleSortGeneric<String> stringSorter = new BubbleSortGeneric<>();
		System.out.println("String Bubble sorting");
		System.out.println("\nBefore sorting :");
		stringSorter.printArray(string);
		stringSorter.bubbleSort(string);
		System.out.println("\nAfter sorting :");
		stringSorter.printArray(string);
		System.out.println();

		System.out.println("\nInteger Bubble sorting");
		Integer[] array = { 8, 4, 1, 5, 9, 6 };
		BubbleSortGeneric<Integer> integerSorter = new BubbleSortGeneric<>();
		System.out.println("\nBefore sorting :");
		integerSorter.printArray(array);
		integerSorter.bubbleSort(array);
		System.out.println("\nAfter sorting :");
		integerSorter.printArray(array);

	}
}
