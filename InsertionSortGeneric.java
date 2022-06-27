package com.bridgelabz;

public class InsertionSortGeneric<T> {

	// Function to print array
		public static <T> void printArray(T[] arr) {
			for (T t : arr) {
				System.out.print(t + " ");
			}
			System.out.print(" ");
		}
	
	 //Function to sort array using insertion sort										
		public <T extends Comparable<T>> T insertionSort(T[] arr) {                     
										
			for(int i = 1; i<arr.length ; i++){ 					
				T temp = arr[i];							
				int j = i-1;								
				while(j >= 0 && arr[j].compareTo(temp) > 0) {  				           
					arr[j+1] = arr[j];								
					j--;									
				}
				arr[j+1] = temp;						
			}
			return null;                                               
		}
		
		// Main method
		public static void main(String[] args) {
			String[] arrayOfString = { "vish", "madhu", "priya", "ashu", "nisha" };
			InsertionSortGeneric<String> stringSorter = new InsertionSortGeneric<>();
			System.out.println("String Insertion sorting");
			System.out.println("\nBefore sorting :");
			stringSorter.printArray(arrayOfString);
			stringSorter.insertionSort(arrayOfString);
			System.out.println("\nAfter sorting :");
			stringSorter.printArray(arrayOfString);
			System.out.println();

			System.out.println("\nInteger Insertion sorting");
			Integer[] arrOfInteger = { 8, 4, 1, 5, 9, 6 };
			InsertionSortGeneric<Integer> integerSorter = new InsertionSortGeneric<>();
			System.out.println("\nBefore sorting :");
			integerSorter.printArray(arrOfInteger);
			integerSorter.insertionSort(arrOfInteger);
			System.out.println("\nAfter sorting :");
			integerSorter.printArray(arrOfInteger);
		}
	}