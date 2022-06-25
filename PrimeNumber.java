package com.bridgelabz;

public class PrimeNumber {

	static boolean isPrime(int n) {
		int count = 0;
		// 0, 1 negative numbers are not prime
		if (n < 2)
			return false;
		// checking the number of divisors b/w 1 and the number n
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		// if reached here then must be true
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		int lower = 0;
		int upper = 1000;

		System.out.println("Prime Number between 0 to 1000 :");
		for (int i = lower; i <= upper; i++)
			if (isPrime(i))
				System.out.println(i + " ");

	}

}
