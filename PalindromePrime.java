package com.bridgelabz;

import java.util.Scanner;

public class PalindromePrime <T>{
 static int low, upp, rev, count;
 static int num, temp,i;
	
	public <T> void isPrime() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int low = scanner.nextInt();
        System.out.println("Enter the upper limit");
        int upp = scanner.nextInt();
        System.out.println("PrimeNumber and Palindrome numbers between "+low+" to "+upp);
        for (num = low; num <= upp; num++) {
            count = 0;
            rev = 0;
            temp = num;
            for (i = 1; i <= temp; i++) {
                if (temp % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                while (temp > 0) {
                    rev = (rev * 10) + (temp % 10);
                    temp = temp / 10;
                }
                if (rev == num) {
                    System.out.print(num + " ");
                }
            }
        }
	}
	
	public static void main(String[] args) {
		PalindromePrime<Integer> palindromePrime = new PalindromePrime<>(); 
		palindromePrime.isPrime();
	}
}
