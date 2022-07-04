package com.bridgelabz;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramOrNot {

	public static boolean isAnagram(String str1, String str2) {
		// calculate length of two string
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(array1);
			Arrays.sort(array2);
			if (Arrays.equals(array1, array2)) {
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
