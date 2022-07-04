package com.bridgelabz;
import java.util.Scanner;
public class FindingNumber {
	    static Scanner scanner = new Scanner(System.in);
		public static void searchNumber(int upperBound) {
			int low = 0;
			int high = upperBound;
			while (low <= high) {
				int midVal = (low + high) / 2;
				System.out.println("Press 0 if the number is " + midVal);
				System.out.println("Press 1 if the number is between " + low + " to " + midVal);
				System.out.println("Press 2 if the number is between " + (midVal + 1) + " to " + high);
				int choice = scanner.nextInt();
				if (choice == 0) {
					System.out.println("\nGot the number " + midVal);
					break;
				} else if (choice == 1) {
					high = midVal;
				}

				else if (choice == 2) {
					low = midVal + 1;
				}
			}
		}

		public static void main(String[] args) {
			System.out.print("Enter the Maximum Number to Find the element: ");
			int exponent = scanner.nextInt();

			int upperBound = (int) Math.pow(2, exponent);
			System.out.println("upperBound = " + upperBound);

			System.out.println("Think a number between 0 to " + (upperBound));
			searchNumber(upperBound);
		}
	}