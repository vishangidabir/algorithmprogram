package com.bridgelabz;

import java.util.Scanner;

public class BalanceParanthesisMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter max size: ");
		int size = scanner.nextInt();

		// Creating Stack
		BalanceParanthesis stack = new BalanceParanthesis(size);

		// Accepting expression
		System.out.println("Enter expression: ");
		String exp = scanner.next();
		int len = exp.length();

		for (int i = 0; i < len; i++) {

			if (exp.charAt(i) == '{' || exp.charAt(i) == '(') {
				stack.push(exp.charAt(i));
			} else if (!stack.isEmpty()
					&& ((exp.charAt(i) == '}' && stack.peek() == '{') || (exp.charAt(i) == ')' && stack.peek() == '(')))
				stack.pop();
			else
				stack.push(exp.charAt(i));
		}
		if (stack.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
