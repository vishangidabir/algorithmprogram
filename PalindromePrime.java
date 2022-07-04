package com.bridgelabz;

import java.util.Scanner;

public class PalindromePrime <T>{
 static int lower, upper, reverse, count;
 static int num, temp,i;
	
	public <T> void isPrime() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lower = scanner.nextInt();
        System.out.println("Enter the upper limit");
        int upper = scanner.nextInt();
        System.out.println("PrimeNumber and Palindrome numbers between "+lower+" to "+upper);
        for (num = lower; num <= upper; num++) {
            count = 0;
            reverse = 0;
            temp = num;
            for (i = 1; i <= temp; i++) {
                if (temp % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                while (temp > 0) {
                    reverse = (reverse * 10) + (temp % 10);
                    temp = temp / 10;
                }
                if (reverse == num) {
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
