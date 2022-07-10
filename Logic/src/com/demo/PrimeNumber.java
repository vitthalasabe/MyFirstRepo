package com.demo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int no = scanner.nextInt();

		for (int i = no; i > 0; i--) {
			if (no % i == 0) {
				count++;

			}

		}
		if (count > 2) {
			System.out.println("Not Prime");
		} else
			System.out.println(" Prime Number");
	}
}
