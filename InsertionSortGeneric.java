package com.bridgelabz;

public class InsertionSortGeneric {

	 //Function to sort array using insertion sort										
		public <K extends Comparable<K>> K sorting(K [] arr) {                     
										
			for(int i = 1; i<arr.length ; i++){ 					
				K temp = arr[i];							
				int j = i-1;								
				while(j >= 0 && arr[j].compareTo(temp) > 0) {  				           
					arr[j+1] = arr[j];								
					j--;									
				}
				arr[j+1] = temp;						
			}
			return null;                                               
		}
		//Function to print array
		public void printArray(String[] arr) {
			int len = arr.length;
			for(int i = 0; i<len ; i++ ) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}

		// Main method
		public static void main(String[] args) {
			InsertionSort insertionSort = new InsertionSort();

			String[] arr = { "vish", "madhu", "priya", "ashu", "nisha" };

			System.out.println("Before sorting");
			insertionSort.printArray(arr);

			insertionSort.sorting(arr);

			System.out.println("After sorting");
			insertionSort.printArray(arr);
		}
	}