package com.bridgelabz;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramOrNot {

	public static boolean isAnagram(String str1, String str2) {
		// calculate length of two string
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string 1");
		str1 = scanner.next();
		System.out.println("enter string 2");
		str2 = scanner.next();
		
		boolean isAnagram = isAnagram(str1, str2);

		if (isAnagram)
			System.out.println("Is Anagram");
		else
			System.out.println("Not Anagram ");
	}
}
