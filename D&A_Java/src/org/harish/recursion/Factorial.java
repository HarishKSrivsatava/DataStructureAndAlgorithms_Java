package org.harish.recursion;

public class Factorial {

	public static int factorial(int i) {
		if (i == 1)
			return 1;
		else
			return (i * factorial(i - 1));
	}

	public static void main(String[] args) {
		int i = 3;
		System.out.println(i + " ! = " + factorial(i));
	}
}
