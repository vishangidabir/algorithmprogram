package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
	static int lower, upper, number, temp, i, count;

	public void isPrime() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int low = scanner.nextInt();
		System.out.println("Enter the upper limit");
		int upp = scanner.nextInt();
		System.out.println("PrimeNumbers between " + low + " to " + upp);
		for (number = low; number <= upp; number++) {
			count = 0;
			temp = number;
			for (i = 1; i <= temp; i++) {
				if (temp % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(number + " ");
			}
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime();

	}

}
