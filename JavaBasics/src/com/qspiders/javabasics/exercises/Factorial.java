package com.qspiders.javabasics.exercises;

import java.util.Scanner;

public class Factorial {

	static int factorial = 1;
	static int x;

	static void fact(int f) {

		for (int i = f; i >= 1; i--) {

			factorial = factorial * i;

		}
	}

	public static void main(String[] arg) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		x = scn.nextInt();

		fact(x);

		System.out.println("Factorial of entered number is: " + factorial);

	}
}