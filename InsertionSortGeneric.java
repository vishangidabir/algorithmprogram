package com.bridgelabz;

public class InsertionSortGeneric<T> {
	// Function to print array
		public static <T> void printArray(T[] array) {
			for (T t : array) {
				System.out.print(t + " ");
			}
			System.out.print(" ");
		}
	
	 //Function to sort array using insertion sort										
		public <T extends Comparable<T>> T insertionSort(T[] array) {
										
			for(int i = 1; i<array.length ; i++){
				T temp = array[i];
				int j = i-1;								
				while(j >= 0 && array[j].compareTo(temp) > 0) {
					array[j+1] = array[j];
					j--;									
				}
				array[j+1] = temp;
			}
			return null;                                               
		}
		
		// Main method
		public static void main(String[] args) {
			String[] string = { "vish", "madhu", "priya", "ashu", "nisha" };
			InsertionSortGeneric<String> stringSorter = new InsertionSortGeneric<>();
			System.out.println("String Insertion sorting");
			System.out.println("\nBefore sorting :");
			stringSorter.printArray(string);
			stringSorter.insertionSort(string);
			System.out.println("\nAfter sorting :");
			stringSorter.printArray(string);
			System.out.println();

			System.out.println("\nInteger Insertion sorting");
			Integer[] array = { 8, 4, 1, 5, 9, 6 };
			InsertionSortGeneric<Integer> integerSorter = new InsertionSortGeneric<>();
			System.out.println("\nBefore sorting :");
			integerSorter.printArray(array);
			integerSorter.insertionSort(array);
			System.out.println("\nAfter sorting :");
			integerSorter.printArray(array);
		}
	}